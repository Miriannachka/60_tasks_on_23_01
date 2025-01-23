// 1. Класс "Человек"
open class Person(var name: String, var age: Int, var gender: String) {
    fun displayInfo() {
        println("Name: $name, Age: $age, Gender: $gender")
    }
    fun increaseAge() {
        age++
    }
    fun changeName(newName: String) {
        name = newName
    }
}
//// 2. Наследование: Класс "Работник" и "Менеджер"
//open class Worker(name: String, age: Int, gender: String, var salary: Double) : Person(name, age, gender)
//class Manager(name: String, age: Int, gender: String, salary: Double) : Worker(name, age, gender, salary) {
//    val subordinates = mutableListOf<Worker>()
//    fun addSubordinate(worker: Worker) {
//        subordinates.add(worker)
//    }
//}
//// 3. Полиморфизм: Животные
//interface Animal {
//    fun makeSound()
//}
//class Dog : Animal {
//    override fun makeSound() {
//        println("Woof!")
//    }
//}
//class Cat : Animal {
//    override fun makeSound() {
//        println("Meow!")
//    }
//}
//class Cow : Animal {
//    override fun makeSound() {
//        println("Moo!")
//    }
//}
//// Пример полиморфизма
//fun demonstratePolymorphism() {
//    val animals: List<Animal> = listOf(Dog(), Cat(), Cow())
//   for (animal in animals) {
//        animal.makeSound()
//    }
//}
//// 4. Абстрактный класс "Транспорт"
//abstract class Transport {
//    abstract fun move()
//}
//class Car : Transport() {
//    override fun move() {
//        println("Car is driving")
//    }
//}
//class Bike : Transport() {
//    override fun move() {
//        println("Bike is riding")
//   }
//}
//// 5. Класс "Книга" и "Библиотека"
//data class Book(val title: String, val author: String, val year: Int)
//class Library {
//    private val books = mutableListOf<Book>()
//    fun addBook(book: Book) {
//        books.add(book)
//    }
//    fun findByAuthor(author: String): List<Book> {
//        return books.filter { it.author == author }
//    }
//    fun findByYear(year: Int): List<Book> {
//        return books.filter { it.year == year }
//    }
//}
//// 6. Инкапсуляция: Банк
//class BankAccount(val accountNumber: String) {
//   private var _balance: Double = 0.0
//    val balance: Double
//        get() = _balance
//    fun deposit(amount: Double) {
//        if (amount > 0) {
//            _balance += amount
//        }
//    }
//    fun withdraw(amount: Double) {
//        if (amount > 0 && amount <= _balance) {
//            _balance -= amount
//        }
//    }
//}
//// 7. Счетчик объектов
//class Counter {
//    companion object {
//        private var count = 0
//        init {
//            count++
//        }
//        fun getCount(): Int = count
//    }
//}
//// 8. Площадь фигур
//abstract class Shape {
//    abstract fun getArea(): Double
//}
//class Circle(private val radius: Double) : Shape() {
//    override fun getArea(): Double {
//        return Math.PI * radius * radius // πr²
//    }
//}
//class Rectangle(private val width: Double, private val height: Double) : Shape() {
//    override fun getArea(): Double {
//        return width * height // w*h
//    }
//}
//// 9. Наследование: Животные и их движения
//open class AnimalMovement {
//    open fun move() {}
//}
//class Fish : AnimalMovement() {
//    override fun move() {
//        println("Fish swims")
//    }
//}
//class Bird : AnimalMovement() {
//    override fun move() {
//        println("Bird flies")
//    }
//}
//class DogMovement : AnimalMovement() {
//    override fun move() {
//        println("Dog runs")
//    }
//}
//// 10. Работа с коллекциями: Университет
//data class Student(val name: String, val group: String, val grade: Double)
//class University {
//    private val students = mutableListOf<Student>()
//    fun addStudent(student: Student) {
//        students.add(student)
//    }
//    fun sortByName(): List<Student> {
//        return students.sortedBy { it.name }
//    }
//    fun filterByGrade(minGrade: Double): List<Student> {
//        return students.filter { it.grade >= minGrade }
//    }
//}
//// 11. Класс "Магазин"
//data class Product(val name: String, val price: Double, var quantity: Int)
//class Store {
//    private val products = mutableListOf<Product>()
//    fun addProduct(product: Product) {
//        products.add(product)
//    }
//    fun removeProduct(productName: String) {
//        products.removeIf { it.name == productName }
//    }
//    fun findProductByName(name: String): Product? {
//        return products.find { it.name == name }
//    }
//}
//// 12. Интерфейс "Платежная система"
//interface PaymentSystem {
//    fun pay(amount: Double)
//    fun refund(amount: Double)
//}
//class CreditCard : PaymentSystem {
//    override fun pay(amount: Double) {
//       println("Paid $amount using Credit Card")
//    }
//    override fun refund(amount: Double) {
//        println("Refunded $amount to Credit Card")
//    }
//}
//class PayPal : PaymentSystem {
//   override fun pay(amount: Double) {
//       println("Paid $amount using PayPal")
//    }
//    override fun refund(amount: Double) {
//        println("Refunded $amount to PayPal")
//    }
//}
//// 13. Генерация уникальных идентификаторов
//class UniqueID {
//    companion object {
//        private var idCounter = 0
//
//        fun generateID(): Int {
//            return ++idCounter
//        }
//    }
//}
//// 14. Класс "Точка" и "Прямоугольник"
//data class Point(val x: Double, val y: Double)
//class Rectangle(private val topLeft: Point, private val bottomRight: Point) {
//   fun getArea(): Double {
//        val width = bottomRight.x - topLeft.x
//        val height = topLeft.y - bottomRight.y
//        return width * height
//    }
//}
//// 15. Комплексные числа
//data class ComplexNumber(val real: Double, val imaginary: Double) {
//    operator fun plus(other: ComplexNumber): ComplexNumber {
//        return ComplexNumber(real + other.real, imaginary + other.imaginary)
//    }
//    operator fun minus(other: ComplexNumber): ComplexNumber {
//        return ComplexNumber(real - other.real, imaginary - other.imaginary)
//    }
//   operator fun times(other: ComplexNumber): ComplexNumber {
//        return ComplexNumber(
//           real * other.real - imaginary * other.imaginary,
//           real * other.imaginary + imaginary * other.real
//       )
//   }
//    operator fun div(other: ComplexNumber): ComplexNumber {
//        val denominator = other.real * other.real + other.imaginary * other.imaginary
//        return ComplexNumber(
//            (real * other.real + imaginary * other.imaginary) / denominator,
//           (imaginary * other.real - real * other.imaginary) / denominator
//       )
//    }
//}
//// 16. Перегрузка операторов: Матрица
//class Matrix(private val rows: Int, private val cols: Int) {
//    private val data = Array(rows) { DoubleArray(cols) }
//    operator fun plus(other: Matrix): Matrix {
//        val result = Matrix(rows, cols)
//        for (i in 0 until rows) {
//            for (j in 0 until cols) {
//                result.data[i][j] = this.data[i][j] + other.data[i][j]
//           }
//        }
//        return result
//   }
//   operator fun times(other: Matrix): Matrix {
//       val result = Matrix(rows, other.cols)
//       for (i in 0 until rows) {
//           for (j in 0 until other.cols) {
//               result.data[i][j] = (0 until cols).sumOf { this.data[i][it] * other.data[it][j] }
//           }
//       }
//       return result
//   }
//}
//// 17. Создание игры с использованием ООП
//class Player(val name: String, var health: Int) {
//    fun attack(enemy: Enemy, damage: Int) {
//       enemy.takeDamage(damage)
//       println("$name attacks ${enemy.name} for $damage damage.")
//   }
//}
//class Enemy(val name: String, var health: Int) {
//    fun takeDamage(damage: Int) {
//       health -= damage
//        println("$name takes $damage damage and has $health health left.")
//    }
//}
//class Weapon(val type: String, val damage: Int)
//// 18. Автоматизированная система заказов
//data class Order(val customerName: String, val productList: List<Product>) {
//    fun totalCost(): Double = productList.sumOf { it.price * it.quantity }
//}
//class Customer(val name: String)
//class OrderSystem {
//    private val orders = mutableListOf<Order>()
//    fun addOrder(order: Order) {
//        orders.add(order)
//        println("Order added for ${order.customerName}. Total cost is ${order.totalCost()}.")
//   }
//}
//// 19. Наследование: Электроника
//open class Device(var brand: String) {
//    open fun turnOn() {
//        println("$brand device is turned on.")
//    }
//    open fun turnOff() {
//        println("$brand device is turned off.")
//    }
//}
//class Smartphone(brand: String) : Device(brand) {
//    fun takePhoto() {
//        println("$brand smartphone takes a photo.")
//   }
//}
//class Laptop(brand: String) : Device(brand)
//// 20. Игра "Крестики-нолики"
//class Game(private val player1: Player, private val player2: Player) {
//    private var board = Array(3) { Array(3) { ' ' } }
//    fun play(row: Int, col: Int, playerSymbol: Char): Boolean {
//        if (board[row][col] == ' ') {
//            board[row][col] = playerSymbol
//            return true
//        }
//        return false
//    }
    // Дополнительные методы для проверки победителя и отображения доски можно добавить.
//}