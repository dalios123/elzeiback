package com.example.app.javatechie.spring.auth.example.Justificatif;

import jakarta.persistence.*;


import com.example.app.javatechie.spring.auth.example.salaries.Salaries;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Builder;
import lombok.Data;

//@Builder
@Entity
@Table(name = "Justificatif")
@Data
public class Justificatif {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Lob
	    @Basic(fetch = FetchType.LAZY)
	    @Column(name = "fichier",length = 100000)
	    private byte[] fichier;
	    
	    
	    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "salaries_id") // Nom de la colonne de clé étrangère dans la table "salaries"
	   
	    
	    
	    
	    
	    private Salaries salaries;
	    
	    
	    
		public Salaries getSalaries() {
			return salaries;
		}
		public void setSalaries(Salaries salaries) {
			this.salaries = salaries;
		}
		// Ajouter le constructeur avec le builder manuellement
	    public static JustificatifBuilder builder() {
	        return new JustificatifBuilder();
	    }
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		public byte[] getFichier() {
			return fichier;
		}
		public void setFichier(byte[] fichier) {
			this.fichier = fichier;
		}
		 public Justificatif() {
		  // Constructeur par défaut vide nécessaire pour Hibernate
		    }
		
		 public static class JustificatifBuilder {
		        private Long id;
		      
		        private byte[] fichier;
		        private Salaries Salaries;
		        JustificatifBuilder() {
		        }

		        public JustificatifBuilder id(Long id) {
		            this.id = id;
		            return this;
		        }
		        public JustificatifBuilder fichier(byte[] fichier) {
		            this.fichier = fichier;
		            return this;
		        }
		        public JustificatifBuilder Salaries(Salaries Salaries) {
				    this.Salaries = Salaries;
				    return this;
				}
		        public Justificatif build() {
		            return new Justificatif(this.id, this.fichier,this.Salaries);
		        }
		    }
		    // Constructeur avec le builder
		 private Justificatif(Long id, byte[] fichier, Salaries Salaries) {
			    this.id = id;		  
			    this.fichier = fichier;
			    this.salaries = Salaries;
			}
}
