package com.myretail.put.service.impl;

import com.myretail.common.dao.ProductPriceRepository;
import com.myretail.common.model.ProductData;
import com.myretail.common.model.ProductPriceEntity;
import com.myretail.put.service.ProductPriceUpsertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductPriceUpsertServiceImpl implements ProductPriceUpsertService {
    private final ProductPriceRepository productPriceRepository;

    @Autowired
    public ProductPriceUpsertServiceImpl(ProductPriceRepository productPriceRepository) {
        this.productPriceRepository = productPriceRepository;
    }

    @Override
    public void upsertProductPrice(ProductData productData) {
         productPriceRepository.save(new ProductPriceEntity(productData.getId(), productData.getCurrent_price().getValue(), productData.getCurrent_price().getCurrency_code()));
    }
}
