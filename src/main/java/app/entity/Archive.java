
package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;
    import cronapi.CronapiByteHeaderSignature;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela ARCHIVE
* @generated
*/
@javax.persistence.Entity
@javax.persistence.Table(name = "\"ARCHIVE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Archive")
@CronappTable(role=CronappTableRole.CLASS)
public class Archive implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Info")
    @Column(name = "info", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String info;


    /**
    * @generated
    */
    @CronappColumn(attributeType="FILE_DATABASE", label="File")
    @Column(name = "file", nullable = true, unique = false, insertable=true, updatable=true)
    @CronapiByteHeaderSignature
        
        private byte[] file;


    /**
    * Construtor
    * @generated
    */
    public Archive(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Archive setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém info
    * return info
    * @generated
    */
    public java.lang.String getInfo() {
        return this.info;
    }

    /**
    * Define info
    * @param info info
    * @generated
    */
    public Archive setInfo(java.lang.String info) {
        this.info = info;
        return this;
    }
    /**
    * Obtém file
    * return file
    * @generated
    */
    public byte[] getFile() {
        return this.file;
    }

    /**
    * Define file
    * @param file file
    * @generated
    */
    public Archive setFile(byte[] file) {
        this.file = file;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Archive object = (Archive)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}