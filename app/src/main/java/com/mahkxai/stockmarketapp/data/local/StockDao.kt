package com.mahkxai.stockmarketapp.data.local

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface StockDao {

    @Upsert
    suspend fun insertCompanyListings(
        companyListingEntities: List<CompanyListingEntity>
    )


    @Query("DELETE FROM companylistingentity")
    suspend fun clearCompanyListings()

    @Query(
        """
            SELECT *
            FROM companylistingentity
            WHERE '%' || LOWER(:query) || '%' LIKE LOWER(name) OR
                UPPER(:query) == symbol
        """
    )
    suspend fun searchCompanyListing(
        query: String
    ): List<CompanyListingEntity>

}