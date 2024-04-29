package Actividades;

public class TestList{
    public static void main(String[] args) {

        //PRUEBAS CON ARREGLOS (LISTARRAY)
/*      
        // Creación de listas tipo Integer
        ListArray<Integer> ListInteger = new ListArray<>(20);
        for (int i=1; i<8; i++){
            ListInteger.insertLast(i);
        }

        ListArray<Integer> ListInteger2 = new ListArray<>(20);
        for (int i=2; i<=18; i=i+2){
            ListInteger2.insertLast(i);
        }

        // Creación de listas tipo String
        ListArray<String> ListString1 = new ListArray<>(20);
        ListString1.insertLast("Lunes");
        ListString1.insertLast("Martes");
        ListString1.insertLast("Miercoles");
        ListString1.insertLast("Jueves");
        ListString1.insertLast("Viernes");
        ListString1.insertLast("Sabado");
        ListString1.insertLast("Domingo");
        ListString1.insertLast("Semana");

        ListArray<String> ListString2 = new ListArray<>(20);
        ListString2.insertFirst("Arroz");
        ListString2.insertLast("Papas");
        ListString2.insertFirst("Lentejas");
        ListString2.insertLast("Azucar");
        ListString2.insertFirst("Tomates");

        // Creación de listas tipo Person
        ListArray<Person> ListPerson = new ListArray<>(20);
        ListPerson.insertFirst(new Person("Sebástien", "Martinez", 30));
        ListPerson.insertLast(new Person("Pepita", "Flores", 25));
        ListPerson.insertLast(new Person("Maria", "Dongo", 25));
        ListPerson.insertLast(new Person("Karita", "Torres", 24));

        //LISTAS
        System.out.println("Lista1 Tipo Integer: ");
        System.out.println(ListInteger.toString());

        System.out.println("Lista2 Tipo Integer: ");
        System.out.println(ListInteger2.toString());

        System.out.println("Lista1 Tipo String: ");
        System.out.println(ListString1.toString());

        System.out.println("Lista2 Tipo String: ");
        System.out.println(ListString2.toString());

        System.out.println("Lista1 Tipo Person: ");
        System.out.println(ListPerson.toString());

        //PRUEBAS PARA LISTARRAY

        ListInteger.removeNode(5);
        ListInteger2.removeNode(16);
        ListString1.removeNode("Semana");
        ListString2.insertLast("Harina");
        ListPerson.insertFirst(new Person("Pedro", "Torres", 24));
        ListPerson.search(new Person("Pedro", "Torres", 24));

        //LISTAS DESPUES DE APLICAR LISTARRAY
        System.out.println("Listas después de aplicar MÉTODOS");
        System.out.println("Lista1 Tipo Integer: ");
        System.out.println(ListInteger.toString());

        System.out.println("Lista2 Tipo Integer: ");
        System.out.println(ListInteger2.toString());

        System.out.println("Lista1 Tipo String: ");
        System.out.println(ListString1.toString());

        System.out.println("Lista2 Tipo String: ");
        System.out.println(ListString2.toString());

        System.out.println("Lista1 Tipo Person: ");
        System.out.println(ListPerson.toString());
*/
/*
        //PRUEBAS CON LISTAS ENLAZADAS (LINKEDLIST)

        // Prueba con Integer
        System.out.println("Listas enlazadas Tipo Integer: ");
        LinkedList<Integer> ListaInteger = new LinkedList<>();
        ListaInteger.insertFirst(12);
        ListaInteger.insertLast(22);
        System.out.println(ListaInteger.toString());
        ListaInteger.removeNode(12);
        System.out.println(ListaInteger.toString());

        // Prueba con String
        System.out.println("Listas enlazadas Tipo String: ");
        LinkedList<String> ListaString = new LinkedList<>();
        ListaString.insertFirst("Perú");
        ListaString.insertLast("Brasil");
        System.out.println(ListaString.toString());
        ListaString.removeNode("Brasil");
        System.out.println(ListaString.toString());

        // Prueba con Person
        System.out.println("Listas enlazadas Tipo Person: ");
        LinkedList<Person> ListaPerson = new LinkedList<>();
        ListaPerson.insertFirst(new Person("John", "Moscoso", 30));
        ListaPerson.insertLast(new Person("Mario", "Torres", 25));
        System.out.println(ListaPerson.toString());
        ListaPerson.removeNode(new Person("Mario", "Torres", 25));
        System.out.println(ListaPerson.toString());
*/

/*
        //PRUEBAS PARA DELETEDUPLICATED CON LINKEDLIST

        LinkedList<Integer> pruebaInteger = new LinkedList<>();     // Prueba con Integer
        LinkedList<Integer> pruebaInteger2 = new LinkedList<>();     // Prueba con Integer
        LinkedList<String> pruebaString = new LinkedList<>();      // Prueba con String
        LinkedList<String> pruebaString2 = new LinkedList<>();      // Prueba con String
        LinkedList<Person> pruebaPerson = new LinkedList<>();      // Prueba con Person
        LinkedList<Person> pruebaPerson2 = new LinkedList<>();      // Prueba con Person

        for (int i=1; i<20; i=i+2){
            pruebaInteger.insertLast(i);
        }
        pruebaInteger.insertFirst(7);
        pruebaInteger.insertFirst(19);

        for (int j=0; j<20; j = j + 2){
            pruebaInteger2.insertLast(j);
        }

        pruebaString.insertLast( "mariposa");
        pruebaString.insertLast("gusano");
        pruebaString.insertLast( "abeja");
        pruebaString.insertLast("hormiga");
        pruebaString.insertLast( "escarabajo");
        pruebaString.insertLast("libelula");

        pruebaString2.insertLast( "azul");
        pruebaString2.insertLast("rojo");
        pruebaString2.insertLast( "verde");
        pruebaString2.insertLast("plomo");
        pruebaString2.insertLast( "negro");
        pruebaString2.insertLast("blanco");
        pruebaString2.insertFirst("blanco");

        pruebaPerson.insertFirst(new Person("Steve", "Moscoso", 20));
        pruebaPerson.insertLast(new Person("Karlo", "Torres", 23));
        pruebaPerson.insertFirst(new Person("Jerson", "Ordoñez", 22));
        pruebaPerson.insertLast(new Person("Adrien", "Caldeña", 25));

        pruebaPerson2.insertFirst(new Person("Anthonella", "Campos", 24));
        pruebaPerson2.insertLast(new Person("Carolina", "Vega", 26));
        pruebaPerson2.insertFirst(new Person("Valeria", "Lopez", 27));
        pruebaPerson2.insertLast(new Person("Luciana", "Campos", 23));
        pruebaPerson2.insertLast(new Person("Carolina", "Vega", 26));

        System.out.println("Creación de listas tipo Integer: ");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println("Lista pruebaInteger: ");
        System.out.println(pruebaInteger.toString());
        System.out.println("Lista pruebaInteger2: ");
        System.out.println(pruebaInteger2.toString());
        System.out.println("<<<<<<<<<<<<<<<<<<");

        System.out.println("Creación de listas tipo String: ");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println("Lista pruebaString: ");
        System.out.println(pruebaString.toString());
        System.out.println("Lista pruebaString2: ");
        System.out.println(pruebaString2.toString());
        System.out.println("<<<<<<<<<<<<<<<<<<");

        System.out.println("Creación de listas tipo Person: ");
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println("Lista pruebaPerson: ");
        System.out.println(pruebaPerson.toString());
        System.out.println("Lista pruebaPerson2: ");
        System.out.println(pruebaPerson2.toString());
        System.out.println("<<<<<<<<<<<<<<<<<<");


        System.out.println("Después de la aplicación de deleteDuplicates Listas Integer: ");
        pruebaInteger.deleteDuplicates();
        System.out.println(pruebaInteger.toString());
        pruebaInteger2.deleteDuplicates();
        System.out.println(pruebaInteger2.toString());

        System.out.println("Después de la aplicación de deleteDuplicates Listas String: ");
        pruebaString.deleteDuplicates();
        System.out.println(pruebaString.toString());
        pruebaString2.deleteDuplicates();
        System.out.println(pruebaString2.toString());

        System.out.println("Después de la aplicación de deleteDuplicates Lista Person: ");
        pruebaPerson.deleteDuplicates();
        System.out.println(pruebaPerson.toString());
        pruebaPerson2.deleteDuplicates();
        System.out.println(pruebaPerson2.toString());
*/
/**/
        /////////////////////////////
        //PRUEBAS EJERCICIO N°1
        System.out.println(">>>>>>>>>> PRUEBAS EJERCICIO N°1 <<<<<<<<<<<<<<<<");
        System.out.println("Prueba con letras repetidas: ");
        LinkedList<Character> letras = new LinkedList<>();
        letras.insertFirst('c');
        letras.insertFirst('c');
        letras.insertFirst('b');
        letras.insertFirst('a');

        System.out.println(letras.toString());
        letras.deleteDuplicates();
        System.out.println(letras.toString());

        System.out.println("Prueba con números - dos digitos: ");
        LinkedList<Integer> dosNumeros = new LinkedList<>();
        dosNumeros.insertFirst(56);
        dosNumeros.insertFirst(89);
        dosNumeros.insertFirst(89);
        dosNumeros.insertFirst(56);
        dosNumeros.insertFirst(89);
        dosNumeros.insertFirst(47);

        System.out.println(dosNumeros.toString());
        dosNumeros.deleteDuplicates();
        System.out.println(dosNumeros.toString());

        System.out.println("Prueba con números - un digito: ");
        LinkedList<Integer> unNumero = new LinkedList<>();
        for (int i=1; i<=6; i++){
            unNumero.insertLast(i);
        }

        System.out.println(unNumero.toString());
        unNumero.deleteDuplicates();
        System.out.println(unNumero.toString());

        System.out.println("Prueba con palabras: ");
        LinkedList<String> nombres = new LinkedList<>();
        nombres.insertFirst("Luis");
        nombres.insertFirst("Rodrigo");
        nombres.insertFirst("Luis");

        System.out.println(nombres.toString());
        nombres.deleteDuplicates();
        System.out.println(nombres.toString());


        /////////////////////////////
        //PRUEBAS EJERCICIO N°2

        System.out.println(">>>>>>>>>> PRUEBAS EJERCICIO N°2 <<<<<<<<<<<<<<<<");
        System.out.println("Prueba con letras: ");
        LinkedList<Character> letras1 = new LinkedList<>();
        letras1.insertFirst('d');
        letras1.insertFirst('b');
        letras1.insertFirst('a');

        System.out.println("Prueba N°1: ");

        System.out.println(letras1.toString());
        letras1.insertNth('c', 2);
        System.out.println(letras1.toString());

        System.out.println("Prueba N°2: ");

        letras1.removeNode('c');
        System.out.println(letras1.toString());
        letras1.insertNth('c', 3);
        System.out.println(letras1.toString());

        System.out.println("Prueba N°3: ");

        letras1.removeNode('c');
        System.out.println(letras1.toString());
        letras1.insertNth('c', 5);
        System.out.println(letras1.toString());

        System.out.println("Prueba con números: ");
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.insertFirst(30);
        numeros.insertFirst(20);
        numeros.insertFirst(10);

        System.out.println(numeros.toString());
        numeros.insertNth(5, 0);
        System.out.println(numeros.toString());


        /////////////////////////////
        //PRUEBAS EJERCICIO N°3

        System.out.println(">>>>>>>>>> PRUEBAS EJERCICIO N°3 <<<<<<<<<<<<<<<<");
        System.out.println("Prueba N°1: ");

        System.out.println(letras1.toString());
        letras1.deleteNth(2);
        System.out.println(letras1.toString());

        System.out.println("Prueba N°2: ");

        letras1.insertLast('d');
        System.out.println(letras1.toString());
        letras1.deleteNth(4);
        System.out.println(letras1.toString());

        System.out.println("Prueba N°3: ");

        System.out.println(letras1.toString());
        letras1.deleteNth(0);
        System.out.println(letras1.toString());

        System.out.println("Prueba con números: ");
        LinkedList<Integer> numeros1 = new LinkedList<>();
        numeros1.insertFirst(10);

        System.out.println(numeros1.toString());
        numeros1.deleteNth(0);
        System.out.println(numeros1.toString());

    }
}
