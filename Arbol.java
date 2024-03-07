class Arbol {
    Nodo raiz;

    Arbol(int valor) {
        raiz = new Nodo(valor);
    }

    Arbol() {
        raiz = null;
    }

    // Método para imprimir el árbol en orden
    void imprimirEnOrden(Nodo nodo) {
        if (nodo != null) {
            imprimirEnOrden(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            imprimirEnOrden(nodo.derecho);
        }
    }

    public static void main(String[] args) {
        Arbol arbol = new Arbol();

        arbol.raiz = new Nodo(1);
        arbol.raiz.izquierdo = new Nodo(2);
        arbol.raiz.derecho = new Nodo(3);
        arbol.raiz.izquierdo.izquierdo = new Nodo(4);
        arbol.raiz.izquierdo.derecho = new Nodo(5);

        System.out.println("Árbol binario creado con éxito");

        System.out.println("Árbol en orden:");
        arbol.imprimirEnOrden(arbol.raiz);
    }
}