Scanner input = new Scanner(System.in);
void main() {
    String[] preguntas = {
            "Indica cual de las siguientes opciones no es un tipo primitivo en Java:",
            "Que metodo se usa para comparar dos String en Java?",
            "Que comando de Git guarda los cambios en el repositorio?"
            "En que año se creó Java?"
    };

    String[][] opciones = {
            {"int", "char", "boolean", "String"},
            {"==", "equals()", "compare()", "=", "dowesetripla"},
            {"git add", "git status", "git commit", "git init"},
            {"2000", "2010", "1995", "1990"}
    };

    String[] correctas = {"d", "b", "c", "c"};

    String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h"};

    for (int i = 0; i < preguntas.length; i++) {
        System.out.println(preguntas[i]);
        for (int j = 0; j < opciones[i].length; j++) {
            System.out.println(letras[j] + ". " + opciones[i][j]);
        }

        String respuesta = input.nextLine();

        boolean valida = false;
        for (int j = 0; j < letras.length; j++) {
            if (respuesta.equals(letras[j])) {
                valida = true;
            }
        }

        if (!valida) {
            System.out.println("Respuesta no válida: a, b, c, d");
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