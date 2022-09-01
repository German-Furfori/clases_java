package app.service;

public interface IServicios { //Lo que pensaste, tengo que crear varias interfaces para cada implementación, porque son métodos distintos para cada Impl
    /*String insert();
    String update();
    String select();
    String delete();*/

    // Esta interfaz no me sirve entonces, teniendo las otras 3

    void insert(String nombre, String apellido);
    void delete(Integer id);
    String listarTodos();
    String update(String nombre, String apellido, Integer id);
}
