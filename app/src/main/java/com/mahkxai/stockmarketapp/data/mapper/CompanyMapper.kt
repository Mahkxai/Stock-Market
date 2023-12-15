package com.mahkxai.stockmarketapp.data.mapper

import com.mahkxai.stockmarketapp.data.local.CompanyListingEntity
import com.mahkxai.stockmarketapp.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing() = CompanyListing(
    name = name,
    symbol = symbol,
    exchange = exchange,
)

fun CompanyListing.toCompanyListingEntity() = CompanyListingEntity(
    name = name,
    symbol = symbol,
    exchange = exchange,
)