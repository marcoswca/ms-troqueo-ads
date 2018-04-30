package com.troqueo.ads.domain.ad;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.troqueo.ads.domain.user.User;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Document(collection = "ads")
public class Ad implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private ObjectId _id;

    @Field("veiculo")
    private Vehicle veiculo;

    @Field("imagens")
    private List<String> imagens;

    @Field("createdAt")
    private Date createdAt;

    @Field("updatedAt")
    private Date updatedAt;

    @Field("documentacao")
    private VehicleDocument documentacao;

    @Field("negociacao")
    private VehicleDeal negociacao;

    @Field("usuario")
    private ObjectId usuario;

    private User user;

    public Ad(){

    }

    public Ad(ObjectId _id, Vehicle veiculo, List<String> imagens, Date createdAt, Date updatedAt, VehicleDocument documentacao, VehicleDeal negociacao, ObjectId usuario) {
        this._id = _id;
        this.veiculo = veiculo;
        this.imagens = imagens;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.documentacao = documentacao;
        this.negociacao = negociacao;
        this.usuario = usuario;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public Vehicle getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Vehicle veiculo) {
        this.veiculo = veiculo;
    }

    public List<String> getImagens() {
        return imagens;
    }

    public void setImagens(List<String> imagens) {
        this.imagens = imagens;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public VehicleDocument getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(VehicleDocument documentacao) {
        this.documentacao = documentacao;
    }

    public VehicleDeal getNegociacao() {
        return negociacao;
    }

    public void setNegociacao(VehicleDeal negociacao) {
        this.negociacao = negociacao;
    }

    public String getUsuario() {
        if(usuario != null) return usuario.toHexString();
        return null;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUsuario(ObjectId usuario) {
        this.usuario = usuario;
    }

}
