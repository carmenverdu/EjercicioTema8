public class main {
        public static void Main(String[] args) {
            // Crear un objeto Persona
            persona persona = new persona();
    
            // Establecer los valores utilizando los setters
            persona.setEdad(25);
            persona.setNombre("Juan");
            persona.setTelefono("123456789");
    
            // Mostrar los valores utilizando los getters
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Teléfono: " + persona.getTelefono());
        }
    }
