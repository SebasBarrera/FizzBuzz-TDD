# 🧪 FizzBuzz-TDD en Java con JUnit

Este proyecto implementa el problema FizzBuzz utilizando **TDD (Desarrollo Guiado por Pruebas)** en Java.  
Se usa **JUnit 5** para pruebas unitarias y **GitHub Codespaces** como entorno de desarrollo.

---

## 📋 **Requisitos**
- Java 17 o superior.
- Maven 3.8.1 o superior.
- GitHub Codespaces habilitado.

---

## ⚙️ **Configuración del Proyecto**

1. **Clonar el Repositorio**  
```
git clone https://github.com/tu-usuario/FizzBuzz-TDD.git  
cd FizzBuzz-TDD
```

2. **Abrir en GitHub Codespaces**  
- En GitHub, haz clic en **Code > Codespaces** y crea un nuevo Codespace.

---

## 🧩 **Desarrollo con TDD**
- Si es múltiplo de 3: devuelve `"Fizz"`.
- Si es múltiplo de 5: devuelve `"Buzz"`.
- Si es múltiplo de ambos: devuelve `"FizzBuzz"`.
- De lo contrario, devuelve el número como cadena.

---

## 💾 **Código Principal**
```
public class FizzBuzz {
    public static String fizzbuzz(int n) {
        StringBuilder result = new StringBuilder();
        if (n % 3 == 0) result.append("Fizz");
        if (n % 5 == 0) result.append("Buzz");
        return result.isEmpty() ? String.valueOf(n) : result.toString();
    }
}
```

---

## 🧪 **Pruebas Unitarias**
```
@Test
void When_MultipleOf3And5_Then_ReturnFizzBuzz() {
    int input = 15;
    String expected = "FizzBuzz";
    String actual = FizzBuzz.fizzbuzz(input);
    assertEquals(expected, actual, "Fallo: Se esperaba '" + expected + "' pero se obtuvo '" + actual + "'.");
}
```

---

## ✅ **Ejecución de Pruebas**
```
mvn test
```

