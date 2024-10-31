package co.edu.eci.lambda.springrest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private static final String inputlist = "%s";

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/linearsearch")
    public LinearSearch linearSearch(@RequestParam(value = "list",  defaultValue = "") String list, @RequestParam(value = "value", defaultValue = "13") String value) {
        return new LinearSearch("linearSearch", String.format(inputlist, list), value, LinearSearchA.linearSearch(list, value));
    }

    @GetMapping("/binarysearch")
    public BinarySearch binarySearch(@RequestParam(value = "list",  defaultValue = "") String list, @RequestParam(value = "value", defaultValue = "13") String value) {
        return new BinarySearch("binarySearch", String.format(inputlist, list), value, LinearSearchA.linearSearch(list, value));
    }

}