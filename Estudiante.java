
import java.lang.String;
public class Estudiante
{
    private String codigo;
    private String nombre;
    private String telefono;
    private String email;
    private String direccion;
    private Integer edad;
    private String documento;
    private String tipodoc;
    private Integer creditos;
    private Integer semestre;
    private String estado;
    private Carrera carrera;
    
    public Estudiante (String codigo,String nombre,String telefono,String email,String direccion,Integer edad,String documento,String tipodoc,Integer creditos,Integer semestre,String estado, Carrera carrera)
   {
    this.codigo=codigo;
    this.nombre=nombre;
    this.telefono=telefono;
    this.email=email;
    this.direccion=direccion;
    this.edad=edad;
    this.documento=documento;
    this.tipodoc=tipodoc;
    this.creditos=creditos;
    this.semestre=semestre;
    this.estado=estado;
    this.carrera=carrera;
    }
    public Estudiante()
    {
        this.codigo="0151803";
        this.nombre="Claudia Gómez";
        this.telefono="3112490070";
        this.email="claudiaygomez@ufps.edu.co";
        this.direccion="Av 17 Libertadores";
        this.edad=34;
        this.documento="37391391";
        this.tipodoc="cc";
        this.creditos=120;
        this.semestre=20;
        this.estado="Activo";
        this.carrera=new Carrera();
    }
        public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipodoc() {
        return tipodoc;
    }

    public void setTipodoc(String tipodoc) {
        this.tipodoc = tipodoc;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Carrera getCarrera(){
        
        return carrera;
    }
    
    public void setCarrera(Carrera carrera)
    {
    this.carrera=carrera;
    
    }
    
    public void mostraredad()
    {
       if (getEdad()>=18)
       {
        System.out.println("usted es mayor de edad");
       }
       else
       {
        
       System.out.println("usted es menor de edad"); 
       }
    
    }
    
    public void TotalCreditos()
    {
    if (getCreditos()>=carrera.getNumecreditos())
    {
    System.out.println("El estudiante a cursado"+ getCreditos());
    System.out.println("La carrera tiene"+ carrera.getNumecreditos());
    System.out.println("Estas a un paso de ser"+ carrera.getTitulo());
    }
    else {
    System.out.println("El estudiante a cursado"+ getCreditos());
    System.out.println("La carrera tiene"+ carrera.getNumecreditos());
    System.out.println("el que persevera alcanza");
    }
    
    }
    
    public void MatricularProyecto()
    {
    if (getCreditos()>=(carrera.getNumecreditos()*0.7)&&getSemestre()>7)
    {
       System.out.println("señor estudiante usted ya puede matricular proyecto");
    }
    else {
    
    System.out.println("usted todavia no puede matricular proyecto");
    }
    
   
    }
    
    public void PromedioCreditos()
    {
        Float promedio= (float)(getCreditos()/getSemestre());
        System.out.println("El promedio de creditos cursados es : " + promedio);
    }
    
    public void ActuEstado()
    {
    
    if (getSemestre()>=carrera.getNumesem())
    {
        this.estado="PFU";
    
    }
        System.out.println("los semestres son:"+ getSemestre());
        System.out.println("los semestres cursados son:" + carrera.getNumesem());
        
    }
    
    //calcular si el estudiante es mayor de edad
    //calcular promedio de creditos cursados
    //matricular proyecto de grado , el estudiante debe de haber aprobado el 70% de los creditos y estar en el 7 semestre
    //obtenet el promedio de creditos por semestre
    //mostrar si el estudiante curso el total de creditos de la carrera
    //actualizar el estado (el estudiante puede tener estado:Matriculado,PFU,
}
