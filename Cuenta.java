class Cuenta extends Banco
{
    //Atributos
    String nombre;
    int PIN;
    float balance;

    //Constructor
    public Cuenta(String nombre, int PIN, float balance)
    {
        setNombre(nombre);
        setPIN(PIN);
        setBalance(balance);
    }

    //SETTERS
    protected void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    protected void setPIN(int PIN)
    {
        this.PIN = PIN;
    }
    protected void setBalance(float balance)
    {
        this.balance = balance;
    }


    //GETTERS
    protected String getNombre()
    {
        return nombre;
    }
    protected int getPIN()
    {
        return PIN;
    }
    protected float getBalance()
    {
        return balance;
    }

}