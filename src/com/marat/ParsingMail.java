package com.marat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsingMail {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст с почтами");
            String a = scanner.nextLine();

            Pattern email = Pattern.compile("\\w+@(gmail|yandex)\\.(com|ru)");
            Matcher matcher = email.matcher(a);

            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }
}