# My First Java Program

## Description
This is a simple Java command-line application that demonstrates basic Java programming concepts. It interacts with the user by displaying a welcome message, prompting for their name, and showing a personalized greeting, a random fun fact about Java, and the current Java version.

## Features
- Personalized greeting based on user input.
- A randomly selected fun fact about Java.
- Java version display using `System.getProperty("java.version")`.
- Soft-colored terminal output for better readability.
- Uses `SecureRandom` for improved randomness.

## Folder Structure
This project follows a structured workspace with the following folders:
- `src/` - Contains the source code files.
- `lib/` - Stores external dependencies.
- `bin/` - Stores compiled output files (generated automatically).

> To customize the folder structure, edit `.vscode/settings.json` and update the relevant settings.

## Color Palette Used
The following colors have been used for the terminal output:
- **Soft Yellow**: `#ffbe0b`
- **Soft Orange**: `#fb5607`
- **Bright Pink**: `#ff006e`
- **Purple**: `#8338ec`
- **Sky Blue**: `#3a86ff`

## Installation & Usage
### Prerequisites
- Java Development Kit (JDK) installed (Recommended: JDK 11 or later)
- A terminal or command prompt

### Steps to Run
1. Clone this repository:
   
   ```sh
   git clone <repository-url>
   cd <repository-folder>
   ```
2. Compile the Java file:
   
   ```sh
   javac MyFirstProgram.java
   ```
3. Run the program:
   
   ```sh
   java MyFirstProgram
   ```

## Example Output
```
======================================================================
Hello, welcome to My First Java Program!
Enter your name: John
======================================================================
Hello, John! Nice to meet you.
Did you know? Minecraft was originally developed in Java.
Your Java version: 17.0.1
======================================================================
```

## Author
[Wyatt Matthew](https://github.com/wyattmatt)

## License
This project is open-source and available under the MIT License. See the [LICENSE](https://github.com/wyattmatt/Lab-1---Guess-The-Number/blob/main/LICENSE) file for details.
