/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetolanchonete;

import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe que contém funcionalidades para construção de relatórios acerca de objetos no sistema da lanchonete.
 * @author Aguinele Queiroz
 * @author Cássia Pires
 */
public class Relatorio {

    /**
     * Emite relatorio de Clientes da lanchonete registrados no sistema.
     */
    public static void clientes() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Miriam\\Downloads\\SistemadePedidosLanchonete (1)\\SistemadePedidosLanchonete\\filesjson\\Clientes.json");
            for (Cliente cliente : Sistema.getLista_cliente()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(cliente);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Emite relatorio de Pedidos realizados.
     */
    public static void pedidos() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Miriam\\Downloads\\SistemadePedidosLanchonete (1)\\SistemadePedidosLanchonete\\filesjson\\Pedidos.json");
            for (Pedido pedido : Sistema.getLista_pedido()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(pedido);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Emite relatorio de Colaboradores registrados no sistema.
     */
    public static void colaboradores() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Miriam\\Downloads\\SistemadePedidosLanchonete (1)\\SistemadePedidosLanchonete\\filesjson\\Colaboradores.json");
            for (Colaborador colaborador : Sistema.getColaboradores_lista()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(colaborador);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Emite relatorio de Produtos em estoque.
     */
    public static void produtos() {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Miriam\\Downloads\\SistemadePedidosLanchonete (1)\\SistemadePedidosLanchonete\\filesjson\\Produtos.json");
            for (Produto produto : Sistema.getVetor_produto()) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                try {
                    String json = gson.toJson(produto);

                    fileWriter.write(json);
                    fileWriter.write("\n,");
                    fileWriter.flush();

                    System.out.println(json);

                } catch (IOException e) {
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Relatorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
