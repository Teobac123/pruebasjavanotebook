class registroej1{
    public static void main(String[] args) {
        registroej1prueba e=new registroej1prueba(1, "Mateo");
       
        System.out.println(e.getFirstName());
        System.out.println();
    }
}

class registroej1prueba{

        // Instance fields need to be present in the record's
        // parameters but record can define static fields.
        static int empToken;
        private String firstName;
        private String lastName;
        private int id;
    
        // Constructor 1 of this class
        // Compact Constructor
        public registroej1prueba() {
            if (id < 100) {
                throw new IllegalArgumentException(
                    "Employee Id cannot be below 100.");
            }
            if (firstName.length() < 2) {
                throw new IllegalArgumentException(
                    "First name must be 2 characters or more.");
            }
        }
        public registroej1prueba(int id, String firstName) {
            this.id = id;
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }
    // Instance methods
    public void getFullName()
    {
        if (lastName == null)
            System.out.println(firstName);

        else
            System.out.println(firstName + " "
                               + lastName);
    }
    // Static methods
    public static int generateEmployeeToken()
    {
        return ++empToken;
    }
}
