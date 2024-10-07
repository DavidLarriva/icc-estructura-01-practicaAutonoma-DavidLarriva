import java.util.Arrays;

public class MetodosOrdenamiento {

    // Método de burbuja tradicional con errores
    // Error encontrado: No devuelve el arreglo, arregle el codigo para que devuelva el arreglo ordenado.
    public int[] burbujaTradicional(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo; //Linea de codigo cambiada, ahora devuelve el arreglo.
    }

    // Método de burbuja tradicional con errores
    // Error encontrado: No tiene errores este metodo, todo esta bien, el metodo ordena de mayor a menor, voy a cambiarlo
    //para que sea de menor a mayor.

    public int[] burbujaTradicionalSegundo(int[] arregloOriginal) {
        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // Intercambio de elementos
                    // Estas 3 lineas NO DEBEN ser modificadas
                    int temp = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temp;
                }
            }
        }

        return arreglo;

    }

    // Método de burbuja tradicional con errores
    // Error encontrado: Error en la logica del intercambio de elementos, cambie diferentes variables.
    public int[] burbujaTradicionalTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        int n = arreglo.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (arreglo[i] < arreglo[j]) { //Cambio aqui tambien 
                    // Intercambio de elementos
                    int temp = arreglo[i]; //aqui deberia ir "i" esta mal el intercambio de las variables en la condicion.
                    arreglo[i] = arreglo[j]; //Ya que es burbuja tradicional deberia cambiar arreglo[i] con arreglo[j]
                    arreglo[j] = temp;
                }
            }
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: Falta el return arreglo
    public int[] seleccionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }

        return arreglo; //Falta el return arreglo.

    }

    // Método de selección con errores
    // Error encontrado:Condicion de la j mal ejecutada
    public int[] seleccionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) { // condicion de la j mal ejecutada
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de selección con errores
    // Error encontrado: condicion y intercambio incorrectos.
    public int[] seleccionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int i = 0; i < arreglo.length ; i++) {
            int indiceMinimo = i;

            for (int j = i + 1; j < arreglo.length; j++) { //Condicion incorrecta
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }

            int smallerNumber = arreglo[indiceMinimo]; //Intercambio mal ejecutado
            arreglo[indiceMinimo] = arreglo[i];
            arreglo[i] = smallerNumber;
        }
        return arreglo;
    }

    // Método de inserción con errores 1
    // Error encontrado: Cambio de condiciones y variables que estaban mal.
    public int[] insercionPrimero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1;

            while (i >= 0 && arreglo[i] > key) { //Cambio en la condiciom de menor a mayor y i >=
                arreglo[i + 1] = arreglo[i];
                i--;
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores 2
    // Error encontrado:
    public int[] insercionSegundo(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);
        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];

            int i = j - 1;

            for (; i >= 0 && arreglo[i] > key; i--) { //LA VARIABLE es key no actual, ademas en vez de j deberia ir i, bucle for
                arreglo[i + 1] = arreglo[i]; //cambiar j por i 
            }
            arreglo[i + 1] = key;
        }
        return arreglo;
    }

    // Método de inserción con errores
    // Error encontrado:
    public int[] insercionTercero(int[] arregloOriginal) {

        int[] arreglo = Arrays.copyOf(arregloOriginal, arregloOriginal.length);

        for (int j = 1; j < arreglo.length; j++) {
            int key = arreglo[j];
            int i = j - 1; //i=j-1

            while (i >= 0 && arreglo[i] > key) { //cambiar de signo y agregar un igual
                arreglo[i + 1] = arreglo[i];
                i--; //i itera en --
            }
            arreglo[i + 1] = key;
        }
        return arreglo; // Deberia retornar en arreglo
    }

}
