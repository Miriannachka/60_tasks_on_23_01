import 'dart:io';
import 'dart:math';

void main() {
  print("Задача 1: Четное или нечетное число");
  stdout.write("Введите целое число: ");
  String? input1 = stdin.readLineSync();
  int? num1 = int.tryParse(input1 ?? '');
  if (num1 != null) {
    if (num1 % 2 == 0) {
      print("$num1 - четное число");
    } else {
      print("$num1 - нечетное число");
    }
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 2: Минимальное из трех чисел");
  stdout.write("Введите три целых числа через пробел: ");
  String? input2 = stdin.readLineSync();
  if (input2 != null) {
    List<String> parts = input2.split(" ");
    if (parts.length == 3) {
      List<int?> nums2 = parts.map((e) => int.tryParse(e)).toList();
      if (nums2.every((element) => element != null)) {
        int? minNum = nums2.whereType<int>().reduce(min);
        print("Минимальное число: $minNum");
      } else {
        print("Неверный ввод чисел");
      }
    } else {
      print("Неверный ввод");
    }
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 3: Таблица умножения на 5");
  for (int i = 1; i <= 10; i++) {
    print("5 x $i = ${5 * i}");
  }
  print("--------------------");

  print("Задача 4: Сумма чисел от 1 до N");
  stdout.write("Введите целое число N: ");
  String? input4 = stdin.readLineSync();
  int? num4 = int.tryParse(input4 ?? '');
  if (num4 != null && num4 > 0) {
    int sum4 = 0;
    for (int i = 1; i <= num4; i++) {
      sum4 += i;
    }
    print("Сумма чисел от 1 до $num4: $sum4");
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 5: Числа Фибоначчи");
  stdout.write("Введите целое число N: ");
  String? input5 = stdin.readLineSync();
  int? num5 = int.tryParse(input5 ?? '');
  if (num5 != null && num5 > 0) {
    int a = 0;
    int b = 1;
    stdout.write("Первые $num5 чисел Фибоначчи: ");
    for (int i = 1; i <= num5; i++) {
      stdout.write("$a ");
      int next = a + b;
      a = b;
      b = next;
    }
    print();
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 6: Проверка простого числа");
  stdout.write("Введите целое число: ");
  String? input6 = stdin.readLineSync();
  int? num6 = int.tryParse(input6 ?? '');
  if (num6 != null) {
    bool isPrime = true;
    if (num6 <= 1) {
      isPrime = false;
    } else {
      int sqrtNum = sqrt(num6.toDouble()).toInt();
      for (int i = 2; i <= sqrtNum; i++) {
        if (num6 % i == 0) {
          isPrime = false;
          break;
        }
      }
    }
    if (isPrime) {
      print("$num6 - простое число");
    } else {
      print("$num6 - не простое число");
    }
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 7: Обратный порядок чисел");
  stdout.write("Введите целое число N: ");
  String? input7 = stdin.readLineSync();
  int? num7 = int.tryParse(input7 ?? '');
  if (num7 != null && num7 > 0) {
    stdout.write("Числа от $num7 до 1: ");
    for (int i = num7; i >= 1; i--) {
      stdout.write("$i ");
    }
    print();
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 8: Сумма четных чисел в диапазоне");
  stdout.write("Введите два целых числа A и B через пробел: ");
  String? input8 = stdin.readLineSync();
  if (input8 != null) {
    List<String> parts8 = input8.split(" ");
    if (parts8.length == 2) {
      List<int?> nums8 = parts8.map((e) => int.tryParse(e)).toList();
      if (nums8.every((element) => element != null)) {
        int a = nums8[0]!;
        int b = nums8[1]!;
        int sum8 = 0;
        if (a <= b) {
          for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
              sum8 += i;
            }
          }
        } else {
          for (int i = b; i <= a; i++) {
            if (i % 2 == 0) {
              sum8 += i;
            }
          }
        }
        print("Сумма четных чисел от $a до $b: $sum8");
      } else {
        print("Неверный ввод чисел");
      }
    } else {
      print("Неверный ввод");
    }
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 9: Реверс строки");
  stdout.write("Введите строку: ");
  String? str9 = stdin.readLineSync();
  if (str9 != null) {
    String reversedStr9 = str9.split('').reversed.join('');
    print("Строка в обратном порядке: $reversedStr9");
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 10: Количество цифр в числе");
  stdout.write("Введите целое число: ");
  String? input10 = stdin.readLineSync();
  int? num10 = int.tryParse(input10 ?? '');
  if (num10 != null) {
    int digitCount = num10.abs().toString().length;
    print("Количество цифр в числе $num10: $digitCount");
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 11: Факториал числа");
  stdout.write("Введите целое число N: ");
  String? input11 = stdin.readLineSync();
  int? num11 = int.tryParse(input11 ?? '');
  if (num11 != null && num11 >= 0) {
    long factorial = 1;
    for (int i = 1; i <= num11; i++) {
      factorial *= i;
    }
    print("Факториал числа $num11: $factorial");
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 12: Сумма цифр числа");
  stdout.write("Введите целое число: ");
  String? input12 = stdin.readLineSync();
  int? num12 = int.tryParse(input12 ?? '');
  if (num12 != null) {
    int sum12 = 0;
    int temp = num12.abs();
    while (temp > 0) {
      sum12 += temp % 10;
      temp ~/= 10;
    }
    print("Сумма цифр числа $num12: $sum12");
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 13: Палиндром");
  stdout.write("Введите строку: ");
  String? str13 = stdin.readLineSync();
  if (str13 != null) {
    String reversedStr13 = str13.split('').reversed.join('');
    if (str13.toLowerCase() == reversedStr13.toLowerCase()) {
      print("Строка '$str13' является палиндромом.");
    } else {
      print("Строка '$str13' не является палиндромом.");
    }
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 14: Найти максимальное число в массиве");
  stdout.write("Введите размер массива: ");
  String? inputSize14 = stdin.readLineSync();
  int? size14 = int.tryParse(inputSize14 ?? '');
  if (size14 != null && size14 > 0) {
    stdout.write("Введите элементы массива через пробел: ");
    String? inputElements14 = stdin.readLineSync();
    if (inputElements14 != null) {
      List<String> elements14 = inputElements14.split(" ");
      if (elements14.length == size14) {
        List<int?> numbers14 = elements14.map((e) => int.tryParse(e)).toList();
        if (numbers14.every((element) => element != null)) {
          int maxNum = numbers14.whereType<int>().reduce(max);
          print("Максимальное число в массиве: $maxNum");
        } else {
          print("Неверный ввод чисел");
        }
      } else {
        print("Неверный ввод");
      }
    } else {
      print("Неверный ввод");
    }
  } else {
    print("Неверный ввод размера массива");
  }
  print("--------------------");

  print("Задача 15: Сумма всех элементов массива");
  stdout.write("Введите размер массива: ");
  String? inputSize15 = stdin.readLineSync();
  int? size15 = int.tryParse(inputSize15 ?? '');
  if (size15 != null && size15 > 0) {
    stdout.write("Введите элементы массива через пробел: ");
    String? inputElements15 = stdin.readLineSync();
    if (inputElements15 != null) {
      List<String> elements15 = inputElements15.split(" ");
      if (elements15.length == size15) {
        List<int?> numbers15 = elements15.map((e) => int.tryParse(e)).toList();
        if (numbers15.every((element) => element != null)) {
          int sum15 = numbers15.whereType<int>().reduce((a, b) => a + b);
          print("Сумма элементов массива: $sum15");
        } else {
          print("Неверный ввод чисел");
        }
      } else {
        print("Неверный ввод");
      }
    } else {
      print("Неверный ввод");
    }
  } else {
    print("Неверный ввод размера массива");
  }
  print("--------------------");

  print("Задача 16: Количество положительных и отрицательных чисел");
  stdout.write("Введите размер массива: ");
  String? inputSize16 = stdin.readLineSync();
  int? size16 = int.tryParse(inputSize16 ?? '');
  if (size16 != null && size16 > 0) {
    stdout.write("Введите элементы массива через пробел: ");
    String? inputElements16 = stdin.readLineSync();
    if (inputElements16 != null) {
      List<String> elements16 = inputElements16.split(" ");
      if (elements16.length == size16) {
        List<int?> numbers16 = elements16.map((e) => int.tryParse(e)).toList();
        if (numbers16.every((element) => element != null)) {
          int positiveCount = 0;
          int negativeCount = 0;
          for (int num in numbers16.whereType<int>()) {
            if (num > 0) {
              positiveCount++;
            } else if (num < 0) {
              negativeCount++;
            }
          }
          print("Количество положительных чисел: $positiveCount");
          print("Количество отрицательных чисел: $negativeCount");
        } else {
          print("Неверный ввод чисел");
        }
      } else {
        print("Неверный ввод");
      }
    } else {
      print("Неверный ввод");
    }
  } else {
    print("Неверный ввод размера массива");
  }
  print("--------------------");

  print("Задача 17: Простые числа в диапазоне");
  stdout.write("Введите два целых числа A и B через пробел: ");
  String? input17 = stdin.readLineSync();
  if (input17 != null) {
    List<String> parts17 = input17.split(" ");
    if (parts17.length == 2) {
      List<int?> nums17 = parts17.map((e) => int.tryParse(e)).toList();
      if (nums17.every((element) => element != null)) {
        int a = nums17[0]!;
        int b = nums17[1]!;

        stdout.write("Простые числа в диапазоне от $a до $b: ");
        for (int i = a; i <= b; i++) {
          bool isPrime = true;
          if (i <= 1) {
            isPrime = false;
          } else {
            int sqrtI = sqrt(i.toDouble()).toInt();
            for (int j = 2; j <= sqrtI; j++) {
              if (i % j == 0) {
                isPrime = false;
                break;
              }
            }
          }
          if (isPrime) {
            stdout.write("$i ");
          }
        }
        print();
      } else {
        print("Неверный ввод чисел");
      }
    } else {
      print("Неверный ввод");
    }
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 18: Подсчет гласных и согласных в строке");
  stdout.write("Введите строку: ");
  String? str18 = stdin.readLineSync();
  if (str18 != null) {
    int vowels = 0;
    int consonants = 0;
    String lowered = str18.toLowerCase();

    for (int codeUnit in lowered.codeUnits) {
      String char = String.fromCharCode(codeUnit);
      if ("aeiouаеёиоуыэюя".contains(char)) {
        vowels++;
      } else if (RegExp(r'[a-zа-я]').hasMatch(char)) {
        consonants++;
      }
    }

    print("Гласных букв: $vowels");
    print("Согласных букв: $consonants");
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 19: Перестановка слов в строке");
  stdout.write("Введите строку из нескольких слов: ");
  String? str19 = stdin.readLineSync();
  if (str19 != null) {
    List<String> words = str19.split(" ");
    String reversedWords = words.reversed.join(" ");
    print("Строка со словами в обратном порядке: $reversedWords");
  } else {
    print("Неверный ввод");
  }
  print("--------------------");

  print("Задача 20: Число Армстронга");
  stdout.write("Введите целое число: ");
  String? input20 = stdin.readLineSync();
  int? num20 = int.tryParse(input20 ?? '');
  if (num20 != null) {
    String numStr = num20.abs().toString();
    int numDigits = numStr.length;
    double sumOfPowers = 0.0;
    for (int i = 0; i < numStr.length; i++) {
      int digit = int.parse(numStr[i]);
      sumOfPowers += pow(digit, numDigits).toDouble();
    }
    if (sumOfPowers.toInt() == num20.abs()) {
      print("$num20 ${num20 < 0 ? 'не ' : ''}является числом Армстронга");
    } else {
      print("$num20 не является числом Армстронга");
    }
  } else {
    print("Неверный ввод");
  }
}
