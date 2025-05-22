# 🔍 What Is Kotlin?

**Kotlin** is a modern, statically typed programming language developed by [JetBrains](https://www.jetbrains.com/), the creators of IntelliJ IDEA. It is designed to be expressive, safe, concise, and fully interoperable with Java. Kotlin is officially supported by Google for Android development and is used in backend, desktop, and multiplatform development.

---

## 💡 Key Characteristics

### ✅ JVM Compatibility
- Kotlin runs on the **Java Virtual Machine (JVM)**.
- It can seamlessly interoperate with existing Java code — you can call Java from Kotlin and vice versa.
- Kotlin can use any Java library or framework without modification.

### 🛠️ Compiler and Output
- The **Kotlin compiler** (`kotlinc`) takes `.kt` source files and compiles them to **Java bytecode**, producing `.class` files (just like Java).
- These `.class` files are packaged into a standard **Java Archive (JAR)** file or **Android APK** (for mobile).
- Kotlin can also compile to:
    - **JavaScript** (for web apps)
    - **Native code** (via LLVM, for cross-platform targets — iOS, Linux, Windows)

### 📦 Kotlin Standard Library
- Kotlin applications require the **Kotlin Standard Library (`kotlin-stdlib`)** at runtime.
- This library contains Kotlin’s core features (e.g., collections, extension functions, null safety utilities).
- When compiling Kotlin code, you typically include:
    - `kotlin-stdlib.jar`
    - Optionally: `kotlin-reflect.jar`, `kotlinx-coroutines-core.jar`, etc.
- In Maven or Gradle projects, these are managed automatically via dependencies.

### 🧰 Tooling and IDE Support
- Kotlin is fully supported in **IntelliJ IDEA**, Android Studio, and also works well in Eclipse and VS Code.
- It includes features like code completion, debugging, and automatic Java-to-Kotlin conversion.

---

## 🚀 Why Use Kotlin?

- **Concise**: Reduces boilerplate compared to Java.
- **Safe**: Includes built-in null safety to eliminate many `NullPointerException` issues.
- **Expressive**: Offers higher-order functions, lambdas, smart casts, and extension functions.
- **Modern**: Supports coroutines for asynchronous programming, and provides data classes, sealed classes, and type inference.
