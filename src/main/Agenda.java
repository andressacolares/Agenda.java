package main;

import java.util.ArrayList;
import java.util.List;
        
    public class Agenda {
            private List<Contato> contatos = new ArrayList<Contato>();
            private int totalContatos;
        
            public void setTotalContatos(int totalContatos) {
                this.totalContatos = totalContatos;
            }
        
            public int getTotalContatos() {
                return totalContatos;
            }
        
            public void setContatos(List<Contato> contatos){
                this.contatos = contatos;
            }
        
            public List<Contato> getContatos(){
                return contatos;
            }

            public void adicionarContato(Contato contato) {
            }

            public boolean removerContato(String string) {
                return false;
            }

            public int getQuantidadeDeFones() {
                return 0;
            }

            public void removerFone(String string, int i) {
            }

            public ArrayList<Contato> pesquisar(String string) {
                return null;
            }

            public int getQuantidadeDeFones(Identificador trabalho) {
                return 0;
            }
        }
