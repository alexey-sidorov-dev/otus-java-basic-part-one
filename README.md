# Домашнее задание курса [OTUS Java Developer. Basic](https://otus.ru/lessons/java-basic/)

## Практика по основам языка Java. Часть 1.

---
[![Actions Status](https://github.com/alexey-sidorov-dev/otus-java-basic-part-one/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-basic-part-one/actions)
[![Actions Status](https://github.com/alexey-sidorov-dev/otus-java-basic-part-one/workflows/SonarCloud%20Scanner/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-basic-part-one/actions)
[![Actions Status](https://github.com/alexey-sidorov-dev/otus-java-basic-part-one/workflows/Dependency%20Review/badge.svg)](https://github.com/alexey-sidorov-dev/otus-java-basic-part-one/actions)
[![LICENSE](https://img.shields.io/badge/license-ISC-brightgreen.svg)](ISC)

### Цель

Научиться решать простые задачи с использованием изученных конструкций языка Java.

### Задания

1. Реализуйте метод _greetings()_, который при вызове должен отпечатать в столбец 4 слова: Hello, World, from, Java;
2. Реализуйте метод _checkSign()_, принимающий в качестве аргументов 3 int переменные _a_, _b_ и _c_. Метод должен
   посчитать
   их сумму, и если она больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае -
   “Сумма отрицательная”;
3. Реализуйте метод _selectColor()_, в теле которого задайте int переменную _data_ с любым начальным значением. Если
   _data_
   меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”, если от 10 до 20 включительно, то
   “Желтый”, если больше 20 - “Зеленый”;
4. Реализуйте метод _compareNumbers()_, в теле которого объявите две int переменные _a_ и _b_ с любыми начальными
   значениями. Если _a_ больше или равно _b_, то необходимо вывести в консоль сообщение “a >= b”, в противном случае
   “a < b”;
5. Создайте метод _addOrSubtractAndPrint(int initValue, int delta, boolean increment)_. Если increment = true, то метод
   должен к
   _initValue_ прибавить _delta_ и отпечатать в консоль результат, в противном случае - вычесть и отпечатать;
6. Вызовите последовательно каждый метод из метода _main()_;
7. *При запуске приложения запросите у пользователя число от 1 до 5, после ввода которого выполните метод,
   соответствующий указанному номеру (т.е. при вводе 1 выполняется метод _greetings_, 2 - _checkSign_ и т.д.). Если
   методам
   требуются аргументы, то сгенерируйте их через _Math.random()_.