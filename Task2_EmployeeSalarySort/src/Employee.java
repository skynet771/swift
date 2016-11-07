/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Employee {

    private String _name;
    private double _salary;
    private String _position;
    private String _department;
    private int _age;
    private String _email;

    Employee(String name, Double salary, String position, String department, int age, String email) {
        _name = name;
        _salary = salary;
        _position = position;
        _department = department;
        _age = age;
        _email = email;
    }

    Employee(String name, Double salary, String position, String department) {
        _name = name;
        _salary = salary;
        _position = position;
        _department = department;

    }

    public double getSalary() {
        return _salary;
    }

    public String getInfo() {
        String s = "";
        if (_email == null) {
            s += String.format("%s,%s,%s", _name, _department, _position);
        } else if (_email != null) {
            s += String.format("%s,%s,%s,%s", _name, _department, _position, _email);
        }
        return s;

    }
}
