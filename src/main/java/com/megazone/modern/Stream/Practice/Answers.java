package com.megazone.modern.Stream.Practice;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import static java.util.Comparator.comparing;

@Component
@Slf4j
public class Answers {


    @EventListener(ApplicationStartedEvent.class)
    public void main() {
        log.info("===== Stream / Practice =====");

        List<Transaction> transactions = Transaction.transactions();

        List<Transaction> result1 = transactions.stream()
            .filter(t -> t.getYear() == 2011)
            .sorted(comparing(Transaction::getValue)).toList();
        result1.forEach(t -> log.debug("result = {}", t));

        List<String> result2 = transactions.stream()
            .map(t -> t.getTrader().getCity())
            .distinct()
            .toList();
        result2.forEach(t -> log.debug("result2 = {}", t));

        List<Trader> result3 = transactions.stream()
            .map(Transaction::getTrader)
            .filter(t -> t.getCity().equals("Cambridge"))
            .distinct()
            .sorted(comparing(Trader::getName))
            .toList();
        result3.forEach(t -> log.debug("result3 = {}", t));

        String result4 = transactions.stream()
            .map(t -> t.getTrader().getName())
            .distinct()
            .sorted()
            .reduce("", (x, y) -> x + "" + y);
        log.debug("result4 = {}", result4);

        if (transactions.stream().anyMatch(t -> t.getTrader().getCity().equals("Milan"))) {
            log.debug("result5 = Milan에 거래자가 있습니다.");
        }

        List<Integer> result6 = transactions.stream()
            .filter(t -> t.getTrader().getCity().equals("Cambridge"))
            .map(Transaction::getValue)
            .toList();
        result6.forEach(r -> log.debug("r = {}", r.toString()));

        Optional<Integer> result7 = transactions.stream()
            .map(Transaction::getValue)
            .reduce(Integer::max);
        log.debug("max = {}", result7);

        // .max()
        Optional<Transaction> result7t1 = transactions.stream()
            .max(comparing(Transaction::getValue));
        log.debug("min = {}", result7t1);

        Optional<Integer> result8 = transactions.stream()
            .map(Transaction::getValue)
            .reduce(Integer::min);
        log.debug("min = {}", result8);

        // .min()
        Optional<Transaction> result8t1 = transactions.stream()
            .min(comparing(Transaction::getValue));
        log.debug("min = {}", result8t1);


    }

}
