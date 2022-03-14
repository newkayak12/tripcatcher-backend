package com.tripcatcher.tripcatcherbackend.common.entityListener;

import com.tripcatcher.tripcatcherbackend.common.annotation.FetchWith;
import com.tripcatcher.tripcatcherbackend.domain.entity.DiscountRate;
import com.tripcatcher.tripcatcherbackend.domain.repository.discountRateRepository.DiscountRateRepository;
import lombok.RequiredArgsConstructor;

import javax.persistence.Id;
import javax.persistence.PostLoad;
import java.lang.reflect.Field;
@RequiredArgsConstructor
public class DiscountRateEntityListener {

    DiscountRateRepository discountRateRepository;


    @PostLoad
    public void postLoad(Object entity){
        Field[] fields = entity.getClass().getFields();
        Object roomNo = null;
        Object discountRate = null;
        try{
            for(Field field : fields){
                if(field.isAnnotationPresent(FetchWith.class)){
                    field.setAccessible(true);
                    discountRate = field.get(entity);
                }
                if(field.isAnnotationPresent(Id.class)){
                    field.setAccessible(true);
                    roomNo = field.get(entity);
                }
            }

            DiscountRate rate = discountRateRepository.fetchDiscountRate((Long) roomNo);

            for(Field field : fields){
                if(field.isAnnotationPresent(FetchWith.class)){
                    field.setAccessible(true);
                    field.set(discountRate, rate);
                }
            }
        } catch (IllegalAccessException e){
            e.getStackTrace();
        }




    }
}
