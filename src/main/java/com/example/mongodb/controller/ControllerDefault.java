package com.example.mongodb.controller;

import com.example.mongodb.dto.LoginUser;
import com.example.mongodb.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * interfaz para los metodos que recibe mediante http
 */
public interface ControllerDefault {


    /**
     * funciones de prueba
     * @return
     */
    public ResponseEntity<String> hola();
    public ResponseEntity<String> holaauthenticate();
    public ResponseEntity<String> userPing();
    public ResponseEntity<String> employeePing();
    public ResponseEntity<String> adminPing();
    public ResponseEntity<String> useremployeeePing();



    /**
     * registrar usuario, recibe todos lo datos del usuario
     * @param user
     * @return el usuario creado con su rol asigando por defecto
     */
    public ResponseEntity<User> register(@RequestBody User user);

    /**
     * muestra todos los usuarios en la base de datos
     * @return
     */
    public ResponseEntity<List<User>> findAllUser();

    /**
     * autenticar usuario
     * @param loginUser username y password
     * @return token de autenticacion para el acceso
     */
    public ResponseEntity<?> authenticate(LoginUser loginUser);

    /**
     * modifica un usuario, previamente tiene que estar autenticado y tener rol de admin o empleado
     * en el caso del empleado solo se puede modificar su propio usuario
     * @param user con todos los datos
     * @return el usuario una vez modificado
     */
    public ResponseEntity<User> update(@RequestBody User user);

    /**
     * elimina un usuario por su id, previamente tiene que estar auttenticado y tener rol de admin
     * @param id
     * @return
     */
    public ResponseEntity<String> delete(@PathVariable Long id);

    }
