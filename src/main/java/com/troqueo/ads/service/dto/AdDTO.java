package com.troqueo.ads.service.dto;

import com.troqueo.ads.domain.ad.Ad;
import com.troqueo.ads.domain.ad.Vehicle;
import com.troqueo.ads.domain.ad.VehicleDeal;
import com.troqueo.ads.domain.ad.VehicleDocument;
import com.troqueo.ads.domain.user.User;
import org.bson.types.ObjectId;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class AdDTO {

    private ObjectId _id;

    private Vehicle veiculo;

    private List<String> imagens;

    private Instant createdAt;

    private Instant updatedAt;

    private VehicleDocument documentacao;

    private VehicleDeal negociacao;

    private ObjectId usuario;

    private User user;

    public AdDTO() {
        // Empty constructor needed for Jackson.
    }

    public AdDTO(Ad ad) {
        this._id = new ObjectId(ad.get_id());
        this.veiculo = ad.getVeiculo();
        this.imagens = ad.getImagens();
        this.createdAt = ad.getCreatedAt();
        this.updatedAt = ad.getUpdatedAt();
        this.documentacao = ad.getDocumentacao();
        this.negociacao = ad.getNegociacao();
        this.usuario = new ObjectId(ad.getUsuario());
        this.user = ad.getUser();
    }

    @Override
    public String toString() {
        return "AdDTO{" +
            "_id=" + _id +
            ", veiculo=" + veiculo +
            ", imagens=" + imagens +
            ", createdAt=" + createdAt +
            ", updatedAt=" + updatedAt +
            ", documentacao=" + documentacao +
            ", negociacao=" + negociacao +
            ", usuario=" + usuario +
            ", user=" + user +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdDTO adDTO = (AdDTO) o;
        return Objects.equals(_id, adDTO._id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(_id);
    }

    public String get_id() {
        if (_id != null) return _id.toHexString();
        return null;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
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

    public ObjectId getUsuario() {
        return usuario;
    }

    public void setUsuario(ObjectId usuario) {
        this.usuario = usuario;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
