package org.example.homework;

import java.math.BigDecimal;
import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        System.out.println("Задание 1");
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        String trimmed = name.trim();
        System.out.println(trimmed);
        //2. перевести текст в верхний регистр
        String trimmedUpperCase = trimmed.toUpperCase();
        System.out.println(trimmedUpperCase);
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        String lowerCase = trimmedUpperCase.toLowerCase();
        if (lowerCase.contains("ова")) {
            System.out.println("Уважаемая " + trimmedUpperCase);
        } else if (lowerCase.contains("ов")) {
            System.out.println("Уважаемый " + trimmedUpperCase);
        } else
            System.out.println("Неизвестное лицо " + trimmedUpperCase);
        System.out.println("----------------");
    }

    public static void ex2() {
        System.out.println("Задание 2");
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel >= 10
                && (isWheelWork1 || isWheelWork2 || isWheelWork3 || isWheelWork4)
                && !hasErrors
                && isEngineWork
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
        System.out.println("----------------");
    }

    public static void ex3() {
        System.out.println("Задание 3");
        String simply = "this is simply. This is my favorite song.";

        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are',
        String lowerCase = simply.toLowerCase();
        String replaced = lowerCase.replace("this is", "those are");
        System.out.println(replaced);
        // получить индекс (число) второй буквы 'o' в строке
        int indexOfFirst = replaced.indexOf("o");
        int indexOfSecond = replaced.indexOf("o", indexOfFirst + 1);
        //Распечатать полученный индекс
        System.out.println(indexOfSecond);
        System.out.println("----------------");
    }

    public static void ex4() {
        System.out.println("Задание 4");
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,
        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг

        //Всего продано
        int sausage = 2000;
        int ham = 8511;
        int porknecks = 6988;

        //стоимость
        int sausagePrice = 800;
        int hamPrice = 350;
        int porknecksPrice = 500;

        //вычисление себестоимости
        int sausageCostPrice = 0;
        if (sausage < 1000) {
            sausageCostPrice = 412;
        } else if (sausage >= 1000 && sausage < 2000) {
            sausageCostPrice = 408;
        } else {
            sausageCostPrice = 404;
        }

        int hamCostPrice = 275;

        int porknecksCostPrice = 0;
        if (porknecks < 500) {
            porknecksCostPrice = 311;
        } else {
            porknecksCostPrice = 299;
        }



        //Доход компании
        long incomeSausage = sausage * sausagePrice;
        long incomeHam = ham * hamPrice;
        long incomePorknecks = porknecks * porknecksPrice;
        long income = incomeSausage + incomeHam + incomePorknecks;

        //Расход компании
        long expenseSausage = sausageCostPrice * sausage;
        long expenseHam = hamCostPrice * ham;
        long expensePorknecks = porknecksCostPrice * porknecks;
        long expense = expenseSausage + expenseHam + expensePorknecks + 1000000;

        //Прибыль до налогов
        long profitBeforeTax = income - expense;

        //Налог
        double taxes = 0;
        if (profitBeforeTax > 2000000) {
            taxes = 80000;
            profitBeforeTax = profitBeforeTax - 1000000;
            if (profitBeforeTax < 2000000 && profitBeforeTax > 1000000) {
                profitBeforeTax = profitBeforeTax - 1000000;
                taxes = taxes + 100000;
                if (profitBeforeTax < 1000000) {
                    taxes = taxes + 65000;
                }
            }
        } else if (profitBeforeTax < 2000000 && profitBeforeTax > 1000000) {
            taxes = 100000;
            profitBeforeTax = profitBeforeTax - 1000000;
            if (profitBeforeTax < 1000000) {
                taxes = taxes + 65000;
            }
        } else if (profitBeforeTax < 1000000) {
            taxes = 65000;
        }

        //Пересчитываю, чтоб вернуть обратно значение
        profitBeforeTax = income - expense;

        //Распечатываем результат
        System.out.println("Колбаса: " + sausage);
        System.out.println("Ветчина: " + ham);
        System.out.println("Щейки: " + porknecks);
        System.out.println();
        System.out.println("Прибыль после налогов: " + (profitBeforeTax - taxes));
    }
}
