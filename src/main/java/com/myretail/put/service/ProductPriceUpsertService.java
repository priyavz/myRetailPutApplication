package com.myretail.put.service;

import com.myretail.common.model.CurrentPrice;
import com.myretail.common.model.ProductData;
import com.myretail.common.model.ProductPriceEntity;

public interface ProductPriceUpsertService {
    public void upsertProductPrice(ProductData productData);
}
