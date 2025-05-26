package com.wallan.controlegastos.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Schema(description = "DTO de entrada para criar ou atualizar uma transação")
public class TransacaoRequestDTO {

    @Schema(description = "Descrição da transação", example = "Compra no mercado", required = true)
    @NotBlank(message = "A descrição é obrigatória")
    @Size(max = 255, message = "A descrição deve ter no máximo 255 caracteres")
    private String descricao;

    @Schema(description = "Valor da transação", example = "149.99", required = true)
    @NotNull(message = "O valor é obrigatório")
    @DecimalMin(value = "0.01", message = "O valor deve ser maior que zero")
    private BigDecimal valor;

    @Schema(description = "Tipo da transação (ENTRADA ou SAIDA)", example = "ENTRADA", required = true)
    @NotBlank(message = "O tipo é obrigatório")
    private String tipo;

    @Schema(description = "Data da transação", example = "2025-05-25", required = true)
    @NotNull(message = "A data é obrigatória")
    private LocalDate data;

    // Getters e Setters
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public BigDecimal getValor() { return valor; }
    public void setValor(BigDecimal valor) { this.valor = valor; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}
