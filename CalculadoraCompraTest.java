/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calc;

/**
 *
 * @author Kyle
 */
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculadoraCompraTest {
 @Test
 public void testarCompraDeUmProduto() {
 CalculadoraCompra calc = new CalculadoraCompra();
 double resultado = calc.calcularTotal(10.0, 1);
 assertEquals(10.0, resultado, 0.001);
 }
 @Test
 public void testarCompraDeVariosProdutos() {
 CalculadoraCompra calc = new CalculadoraCompra();
 double resultado = calc.calcularTotal(15.0, 3);
 assertEquals(45.0, resultado, 0.001);
 }
}
