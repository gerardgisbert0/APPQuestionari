Scanner input = new Scanner(System.in);
void main() {
    String[] preguntas = {
            "Indica cual de las siguientes opciones no es un tipo primitivo en Java:",
            "Que metodo se usa para comparar dos String en Java?",
            "Que comando de Git guarda los cambios en el repositorio?",
            "En que año se creó Java?",
            "Que palabra se usa para crear un array en Java?",
            "Cual es la posicion del primer elemento de un array?",
            "Que tipo de dato usarias para guardar el numero 3.5?",
            "Que bucle se ejecuta como minimo una vez?",
            "Que operador significa 'o' en Java?",
            "Que etiqueta HTML se usa para crear un enlace?",
            "Que propiedad CSS cambia el color del texto?",
            "Que comando de Git muestra el historial de commits?",
            "Que hace el comando git init?",
            "Que devuelve \"Hola\".length()?",
            "Que metodo del Scanner lee una linea entera?",
            "Que palabra clave se usa para heredar de una clase en Java?",
            "Que metodo es el punto de entrada de un programa Java?",
            "Que palabra clave impide que una variable cambie de valor?",
            "Que simbolo se usa para comentar una sola linea en Java?",
            "Que estructura de datos mantiene el orden de insercion y permite duplicados?",
            "Que etiqueta HTML se usa para el titulo mas importante de la pagina?",
            "Que comando de Git sube los commits a GitHub?",
            "Que tipo de dato guarda true o false?",
            "Cuanto vale 7 % 3 en Java?",
            "Que propiedad CSS cambia el tamaño de la letra?"
    };

    String[][] opciones = {
            {"int", "char", "boolean", "String"},
            {"==", "equals()", "compare()", "=", "dowesetripla"},
            {"git add", "git status", "git commit", "git init"},
            {"2000", "2010", "1995", "1990"},
            {"new", "create", "make", "array"},
            {"0", "1", "-1"},
            {"int", "char", "double", "boolean"},
            {"for", "while", "do-while", "foreach"},
            {"&&", "||", "!", "=="},
            {"<link>", "<a>", "<href>", "<url>"},
            {"font-color", "text-color", "color", "background"},
            {"git status", "git log", "git show", "git history"},
            {"Sube los cambios a GitHub", "Crea un repositorio nuevo", "Borra el repositorio", "Descarga un repositorio"},
            {"3", "4", "5"},
            {"next()", "nextInt()", "nextLine()", "readLine()"},
            {"implements", "inherits", "super", "extends"},
            {"start()", "run()", "main()", "init()"},
            {"static", "const", "private", "final"},
            {"//", "/*", "#", "--"},
            {"Set", "Map", "List", "HashSet"},
            {"<h6>", "<title>", "<h1>", "<head>"},
            {"git push", "git pull", "git commit", "git clone"},
            {"int", "String", "boolean", "char"},
            {"1", "2", "2.33", "0"},
            {"font-size", "text-size", "size", "font-weight"}
    };

    String[] correctas = {"d", "b", "c", "c", "a", "a", "c", "c", "b", "b", "c", "b", "b", "b", "c", "d", "c", "d", "a", "c", "c", "a", "c", "a", "a"};

    String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};

    for (int i = 0; i < preguntas.length; i++) {
        System.out.println(preguntas[i]);
        for (int j = 0; j < opciones[i].length; j++) {
            System.out.println(letras[j] + ". " + opciones[i][j]);
        }

        String respuesta = input.nextLine();

        boolean valida = false;
        for (int j = 0; j < opciones[i].length; j++) {
            if (respuesta.equals(letras[j])) {
                valida = true;
            }
        }

        if (!valida) {
            System.out.print("Respuesta no válida:");
            for (int j = 0; j < opciones[i].length; j++) {
                System.out.print(" " + letras[j]);
            }
            System.out.println();
            return;
        }

        if (respuesta.equals(correctas[i])) {
            System.out.println("Respuesta correcta!");
        } else {
            System.out.println("Respuesta incorrecta, la respuesta correcta es: " + correctas[i]);
        }
        System.out.println();
    }
}