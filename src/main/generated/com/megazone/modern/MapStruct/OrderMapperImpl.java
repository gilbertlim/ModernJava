package com.megazone.modern.MapStruct;

import com.megazone.modern.MapStruct.Order.OrderBuilder;
import com.megazone.modern.MapStruct.OrderDto.OrderDtoBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-29T15:28:53+0900",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order orderDtoToEntity(OrderDto orderDto) {
        if ( orderDto == null ) {
            return null;
        }

        OrderBuilder order = Order.builder();

        order.name( orderDto.getName() );
        order.product( orderDto.getProduct() );
        order.price( orderDto.getPrice() );
        order.address( orderDto.getAddress() );
        order.orderedTime( orderDto.getOrderedTime() );

        order.id( (long) 0L );

        return order.build();
    }

    @Override
    public OrderDto orderToDto(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderDtoBuilder orderDto = OrderDto.builder();

        orderDto.name( order.getName() );
        orderDto.product( order.getProduct() );
        orderDto.price( order.getPrice() );
        orderDto.address( order.getAddress() );
        orderDto.orderedTime( order.getOrderedTime() );

        orderDto.img( order.getProduct() + ".jpg" );

        return orderDto.build();
    }
}
