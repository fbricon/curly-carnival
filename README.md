# Curly Carnival

A fun Java script that displays a colorful "Hello" greeting using ASCII art.

## Features

- Generates ASCII art text using [jfiglet](https://github.com/lalyos/jfiglet)
- Applies rainbow colors to the output using [lolcat4j](https://github.com/jamesnetherton/lolcat4j)
- Easy to run with JBang

## Usage

```bash
jbang lol.java [name]
```

Run with a custom name:

```bash
jbang lol.java "Carnival"
```

Run without arguments (defaults to "World!"):

```bash
jbang lol.java
```

## Requirements

- Java 17 or higher
- JBang

## Dependencies

- `lolcat4j` - Rainbow text coloring
- `jfiglet` - ASCII art text generation
