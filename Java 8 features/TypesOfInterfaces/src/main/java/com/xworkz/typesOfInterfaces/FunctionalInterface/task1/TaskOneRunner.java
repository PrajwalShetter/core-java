package com.xworkz.typesOfInterfaces.FunctionalInterface.task1;

import java.util.function.*;

public class TaskOneRunner {

    public static void main(String[] args) {
        Function<String,Integer> function= (s)->s.length();
        System.out.println(function.apply("Kalmesh"));

        BiFunction<Integer,Integer,Integer> sum=(i, j)-> i+j;
        System.out.println(sum.apply(23,46));

        UnaryOperator<String> upper = s -> s.toUpperCase();
        System.out.println(upper.apply("Kalmesh"));


        BinaryOperator<Integer> multiply = (a, b) -> a*b;
        System.out.println("Binary operator"+multiply.apply(34,3));

        Predicate<String> predicate = s -> s.startsWith("A");
        System.out.println("pradiacte-- "+predicate.test("Anjali"));


        BiPredicate<Integer,Integer> biPredicate = (a,b) -> a>b;
        System.out.println("BiPredicate "+biPredicate.test(34,5));


        Consumer<Integer> consumer = s -> System.out.println(s);
        System.out.println("Consumer ");
        consumer.accept(345687);

        BiConsumer<String,Integer> biConsumer = (name,age)-> System.out.println(name+" "+age);
        System.out.println("Bi Consumer");
        biConsumer.accept("kalmesh",22);

        Supplier<String> supplier = ()->"Java";
        System.out.println("supplier--"+supplier.get());


        IntFunction<String> intFunction = i->"Value "+i;
        System.out.println("int Function  "+intFunction.apply(23));


        LongFunction<String> longFunction = l->"Long "+l;
        System.out.println("LongFunction=="+longFunction.apply(78585585L));


        DoubleFunction<String> doubleFunction = d->"Double "+d;
        System.out.println("DoubleFunction== "+doubleFunction.apply(5856.56));


        ToIntFunction<String> toIntFunction = s->s.length();
        System.out.println("ToIntFunction  "+toIntFunction.applyAsInt("Kalmesh"));

        ToLongFunction<String> toLongFunction = s->s.length();
        System.out.println("ToLongFunction  "+toLongFunction.applyAsLong("Kalmesh"));


        ToDoubleFunction<String> toDoubleFunction =s -> (double) s.length();
        System.out.println("toDoubleFunction "+toDoubleFunction.applyAsDouble("Kalmesh"));

        IntToLongFunction intToLongFunction = i -> i * 100L;
        System.out.println("IntToLongFunction " + intToLongFunction.applyAsLong(25));

        IntToDoubleFunction intToDoubleFunction = i -> i * 2.5;
        System.out.println("IntToDoubleFunction " + intToDoubleFunction.applyAsDouble(20));

        LongToIntFunction longToIntFunction = l -> (int) l;
        System.out.println("LongToIntFunction " + longToIntFunction.applyAsInt(987654321L));

        LongToDoubleFunction longToDoubleFunction = l -> l / 2.0;
        System.out.println("LongToDoubleFunction " + longToDoubleFunction.applyAsDouble(500L));

        DoubleToIntFunction doubleToIntFunction = d -> (int) d;
        System.out.println("DoubleToIntFunction " + doubleToIntFunction.applyAsInt(45.87));

        DoubleToLongFunction doubleToLongFunction = d -> (long) d;
        System.out.println("DoubleToLongFunction " + doubleToLongFunction.applyAsLong(99.99));

        IntUnaryOperator intUnaryOperator = i -> i * i;
        System.out.println("IntUnaryOperator " + intUnaryOperator.applyAsInt(8));

        LongUnaryOperator longUnaryOperator = l -> l + 1000;
        System.out.println("LongUnaryOperator " + longUnaryOperator.applyAsLong(5000L));

        DoubleUnaryOperator doubleUnaryOperator = d -> d / 2;
        System.out.println("DoubleUnaryOperator " + doubleUnaryOperator.applyAsDouble(88.8));

        IntBinaryOperator intBinaryOperator = (a, b) -> a + b;
        System.out.println("IntBinaryOperator " + intBinaryOperator.applyAsInt(10, 20));

        LongBinaryOperator longBinaryOperator = (a, b) -> a * b;
        System.out.println("LongBinaryOperator " + longBinaryOperator.applyAsLong(12L, 5L));

        DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a - b;
        System.out.println("DoubleBinaryOperator " + doubleBinaryOperator.applyAsDouble(50.5, 10.5));

        IntPredicate intPredicate = i -> i % 2 == 0;
        System.out.println("IntPredicate " + intPredicate.test(18));

        LongPredicate longPredicate = l -> l > 1000;
        System.out.println("LongPredicate " + longPredicate.test(2500L));

        DoublePredicate doublePredicate = d -> d >= 75.5;
        System.out.println("DoublePredicate " + doublePredicate.test(80.25));

        IntConsumer intConsumer = i -> System.out.println(i);
        System.out.println("IntConsumer");
        intConsumer.accept(500);

        LongConsumer longConsumer = l -> System.out.println(l);
        System.out.println("LongConsumer");
        longConsumer.accept(123456789L);

        DoubleConsumer doubleConsumer = d -> System.out.println(d);
        System.out.println("DoubleConsumer");
        doubleConsumer.accept(987.65);

        IntSupplier intSupplier = () -> 100;
        System.out.println("IntSupplier " + intSupplier.getAsInt());

        LongSupplier longSupplier = () -> 999999L;
        System.out.println("LongSupplier " + longSupplier.getAsLong());

        DoubleSupplier doubleSupplier = () -> 456.78;
        System.out.println("DoubleSupplier " + doubleSupplier.getAsDouble());

        ObjIntConsumer<String> objIntConsumer = (name, age) -> System.out.println(name + " " + age);
        System.out.println("ObjIntConsumer");
        objIntConsumer.accept("Kalmesh", 22);

        ObjLongConsumer<String> objLongConsumer = (name, salary) -> System.out.println(name + " " + salary);
        System.out.println("ObjLongConsumer");
        objLongConsumer.accept("Kalmesh", 50000L);

        ObjDoubleConsumer<String> objDoubleConsumer = (name, marks) -> System.out.println(name + " " + marks);
        System.out.println("ObjDoubleConsumer");
        objDoubleConsumer.accept("Kalmesh", 92.5);

        ToIntBiFunction<String, String> toIntBiFunction = (a, b) -> a.length() + b.length();
        System.out.println("ToIntBiFunction " + toIntBiFunction.applyAsInt("Java", "Lambda"));

        ToLongBiFunction<String, String> toLongBiFunction = (a, b) -> a.length() * b.length();
        System.out.println("ToLongBiFunction " + toLongBiFunction.applyAsLong("Java", "Spring"));

        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> (a + b) / 2.0;
        System.out.println("ToDoubleBiFunction " + toDoubleBiFunction.applyAsDouble(80, 90));

        BooleanSupplier booleanSupplier = () -> true;
        System.out.println("BooleanSupplier " + booleanSupplier.getAsBoolean());


    }
}
