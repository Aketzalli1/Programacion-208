package org.example.Controlador;

import org.example.Modelo.ModeloTablaPintores;
import org.example.Modelo.Pintores;
import org.example.Persistencia.PintoresDAO;
import org.example.Vista.VentanaPintores;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorPintores extends MouseAdapter {
    private VentanaPintores view;
    private ModeloTablaPintores modelo;
    private PintoresDAO pintoresDAO;

    public ControladorPintores(VentanaPintores view) {
        this.view = view;
        this.view = view;
        this.modelo = new ModeloTablaPintores();
        this.pintoresDAO = new PintoresDAO();
        this.view.getTblPint().setModel(modelo);

        this.view.getBtnCargar().addMouseListener(this);
        this.view.getTblPint().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            modelo.cargarTablas();
            this.view.getTblPint().setModel(modelo);
            this.view.getTblPint().updateUI();
        }
        if (e.getSource() == this.view.getBtnAgregar()) {
            System.out.println("Se presionó el botón Agregar");
            Pintores audifono = new Pintores();
            audifono.setId(0);
            audifono.setNombre(this.view.getTxtNombre().getText());
            audifono.setNacimiento(this.view.getTxtNacimiento().getText());
            audifono.setLugar(this.view.getTxtLugar().getText());
            audifono.setEstilo(this.view.getTxtEstilo().getText());
            audifono.setUrl(this.view.getTxtUrl().getText());
            if (modelo.agregarPintor(audifono)) {
                JOptionPane.showMessageDialog(view, "Se agregó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                this.view.getTblPint().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo agregar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }
        if (e.getSource() == this.view.getTblPint()) {
            System.out.println("Evento sobre tabla");
            int index = this.view.getTblPint().getSelectedRow();
            Pintores tmp = modelo.getPintoresAtIndex(index);
            try {
                ImageIcon imagenAudifono = tmp.getImagenPintor();
                if (imagenAudifono != null) {
                    this.view.getLblImagenPin().setIcon(imagenAudifono);
                } else {
                    this.view.getLblImagenPin().setIcon(null);
                    System.out.println("No se pudo obtener la imagen del audífono.");
                }
            } catch (MalformedURLException mfue) {
                System.out.println("Error al obtener la imagen del audífono: " + mfue.toString());
                this.view.getLblImagenPin().setIcon(null);
            }
            this.view.getTxtNombre1().setText(tmp.getNombre());
            this.view.getTxtNacimiento1().setText(tmp.getNacimiento());
            this.view.getTxtLugar1().setText(tmp.getLugar());
            this.view.getTxtEstilo1().setText(tmp.getEstilo());
            this.view.getTxtUrl1().setText(tmp.getUrl());
        }
        if (e.getSource() == this.view.getBtnActualizar()) {
            System.out.println("Evento sobre boton Actualizar");
            int rowIndex = this.view.getTblPint().getSelectedRow();
            Pintores tmp = modelo.getPintoresAtIndex(rowIndex);
            Pintores pintores = new Pintores();
            pintores.setNombre(this.view.getTxtNombre1().getText());
            pintores.setNacimiento(this.view.getTxtNacimiento1().getText());
            pintores.setLugar(this.view.getTxtLugar1().getText());
            pintores.setEstilo(this.view.getTxtEstilo1().getText());
            pintores.setUrl(this.view.getTxtUrl1().getText());
            pintores.setId(tmp.getId());
            if (modelo.modificarPintor(pintores)) {
                JOptionPane.showMessageDialog(view, "Se modificó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarTablas();
                this.view.getTblPint().setModel(modelo);
                this.view.getTblPint().updateUI();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo modificar", "Error al Insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTblPint().updateUI();
        }

        if (e.getSource() == this.view.getBtnEliminar()) {
            ModeloTablaPintores temp = new ModeloTablaPintores();
            int index = this.view.getTblPint().getSelectedRow();
            Pintores tmp = modelo.getPintoresAtIndex(index);
            if (temp.eliminarPintor(Integer.toString(tmp.getId()))) {
                JOptionPane.showMessageDialog(view, "Se eliminó correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarTablas();
                this.view.getTblPint().updateUI();
                this.view.limpiar();
            } else {
                JOptionPane.showMessageDialog(view, "No se pudo eliminar la base", "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.view.limpiar();
    }
}
