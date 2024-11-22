package menu.controller;

import java.util.Arrays;
import java.util.List;

public class Parser {

    private Parser() {
    }

    public static List<String> parseCoachName(String input) {
        return Arrays.asList(input.split(","));
    }

    public static List<String> parseMenuName(String input) {
        return Arrays.asList(input.split(","));
    }
}
