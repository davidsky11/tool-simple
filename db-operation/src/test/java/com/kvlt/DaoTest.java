package com.kvlt;

import com.github.javafaker.Faker;
import com.kvlt.dao.OrderDetailDao;
import com.kvlt.model.OrderDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
public class DaoTest {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    public void testInsert() {
        for (int i = 0; i < 10_0000; i++) {
            orderDetailDao.insert(buildOrderDetail());
        }
    }

    private OrderDetail buildOrderDetail() {
        Faker faker = new Faker();

        Date orderTime = faker.number().randomDigit() % 5 == 0 ? new Date() :
                faker.date().birthday(0, 10);
        return new OrderDetail(
                faker.number().numberBetween(1, 99999) + "",
                faker.number().numberBetween(100000L, 999999L),
                faker.number().numberBetween(1000000000L, 9999999999L),
                orderTime
        );
    }

}
