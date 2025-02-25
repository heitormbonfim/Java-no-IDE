Heitor, here's an updated README.md with a new section showing you how to compile an entire project (all Java files in the folder and its subfolders) into a `build` folder and then run it. Check it out:

````md
# How to Use Java Without an IDE

## Why?

Understanding how to manage Java projects via the terminal helps you grasp what an IDE does under the hood. This knowledge boosts your debugging skills, enhances flexibility, and ensures you're not dependent on a single tool.

## How to Compile a Single Java File via Terminal

Use the `javac` command to compile a Java file:

```sh
javac Main.java
```
````

This command creates a `Main.class` file in the current directory.

## How to Run a Compiled Java File via Terminal

After compiling, run the class file with:

```sh
java Main
```

> **Important:**
>
> - **Do not include the file extension or path.**  
>   Running `java .\Main.class` or `java .\Main` will cause errors like:
>   ```
>   Error: Could not find or load main class .\Main.class
>   Caused by: java.lang.ClassNotFoundException: /\Main/class
>   ```
> - Ensure the public class inside your file is named exactly `Main` (matching the filename) and that it resides in the default package (no package declaration).

## How to Run Java Without Explicit Compilation

For Java 11 and newer, you can run the source file directly without manually compiling it:

```sh
java Main.java
```

This command automatically compiles and executes your program in one step.

## Compiling the Entire Project into a Build Folder

Most IDEs compile the whole project (all Java files) and place the resulting `.class` files into a separate output folder. You can mimic this behavior from the terminal.

### For Linux/macOS

1. **Generate a list of all Java files:**

   ```sh
   find . -name "*.java" > sources.txt
   ```

2. **Compile and output the classes into a folder named `build`:**

   ```sh
   javac -d build @sources.txt
   ```

### For Windows (PowerShell)

Run this command to compile all `.java` files in the current directory and its subdirectories, placing the `.class` files in a folder named `build`:

```ps
javac -d build (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```

> **Note:**  
> This command collects all `.java` files recursively and passes their full paths to `javac`, which then preserves the package structure inside the `build` folder.

## Running the Compiled Code from the Build Folder

After compiling the entire project, run your main class (e.g., `Main`) using the build folder as your classpath:

```sh
java -cp build Main
```

This tells the Java runtime to look for class files inside the `build` folder.

## Additional Tips

- **Check Java Version:**  
  Make sure Java is installed and configured properly:
  ```sh
  java -version
  ```
- **Output Directory for Specific Files:**  
  If you want to compile a single file and output to a specific folder, you can use:
  ```sh
  javac -d build Main.java
  ```
- **Compiling Multiple Files Manually:**  
  For several Java files in the current directory:
  ```sh
  javac *.java
  ```

By mastering these commands, you'll have a solid grasp on how IDEs work behind the scenes—plus you'll be a terminal ninja. Happy coding, alpha male!

```

Let me know if you need any more tweaks or further details, Heitor!
```
