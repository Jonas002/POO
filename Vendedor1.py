class Vendedor:
    def __init__(self, codigo, nome):
        self.codigo = codigo
        self.nome = nome
        self.total_vendas = 0

def cadastrar_vendedor():
    codigo = input("Código: ")
    nome = input("Nome: ")
    return Vendedor(codigo, nome)

def adicionar_venda(vendedor, valor_venda):
    vendedor.total_vendas += valor_venda

def media_vendas(vendedores):
    total_vendas = sum(vendedor.total_vendas for vendedor in vendedores)
    if not vendedores:
        return 0
    return total_vendas / len(vendedores)

def melhor_vendedor(vendedores):
    if not vendedores:
        return None
    return max(vendedores, key=lambda vendedor: vendedor.total_vendas)

def vendedores_treinamento(vendedores, media):
    return [vendedor for vendedor in vendedores if vendedor.total_vendas < media]

def main():
    quantidade_vendedores = int(input("Digite a quantidade de vendedores: "))
    lista_vendedores = []

    for _ in range(quantidade_vendedores):
        novo_vendedor = cadastrar_vendedor()
        lista_vendedores.append(novo_vendedor)

    for vendedor in lista_vendedores:
        valor_venda = float(input(f"Total de vendas de {vendedor.nome} em R$: "))
        adicionar_venda(vendedor, valor_venda)

    media = media_vendas(lista_vendedores)

    print(f"Média de vendas da loja: R${media:.2f}")

    melhor = melhor_vendedor(lista_vendedores)
    if melhor:
        print(f"Melhor vendedor: {melhor.nome}")
    else:
        print("Não há vendedores para determinar o melhor.")

    vendedores_para_treinamento = vendedores_treinamento(lista_vendedores, media)
    if vendedores_para_treinamento:
        print("Vendedores que precisam de treinamento:")
        for vendedor in vendedores_para_treinamento:
            print(f"{vendedor.nome} (Código: {vendedor.codigo})")
    else:
        print("Todos os vendedores estão indo bem.")

if __name__ == "__main__":
    main()
