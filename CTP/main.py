import random

# --------------------- FUNCOES  

# Necessário para o funcionamento do programa, porém não existiria uma "entrada" do usuario.
# Escolhe um contrato dos contratos restantes
def escolha_cd(lista):
    while True:
        for i, contrato in enumerate(lista):
            print(f"{i+1}. {contrato}")
        indice = int(input("Digite o número do contrato que será processado: "))
        if 1 <= indice <= len(lista):
            break
    return lista[indice - 1]

def veiculo_aleatorio(lista):
    veiculo_escolhido = random.choice(lista)
    lista.remove(veiculo_escolhido)
    return veiculo_escolhido

# --------------------- PROCEDIMENTOS

# O Endereço onde habita as possíveis doações
def d_contratos(local):
    if local == "d1":
        print("""O endereço desse local é:
              Rua XXX, número ZZZ
              """)
    elif local == "d2":
        print("""O endereço desse local é:
              Rua CCC, número VVV
              """)
    elif local == "d3":
        print("""O endereço desse local é:
              Rua AAA, número SSS
              """)
    elif local == "d4":
        print("""O endereço desse local é:
              Rua DDD, número FFF
              """)
    elif local == "d5":
        print("""O endereço desse local é:
              Rua QQQ, número WWW
              """)

# Veículos disponíveis para utilizar
def v_contratos(veiculo):
    if veiculo == "v1":
        print("""O melhor veículo disponível é:
              Veículo XXX
              """)
    elif veiculo == "v2":
        print("""O melhor veículo disponível é:
              Veículo ZZZ
              """)
    elif veiculo == "v3":
        print("""O melhor veículo disponível é:
              Veículo AAA
              """)
    elif veiculo == "v4":
        print("""O melhor veículo disponível é:
              Veículo SSS
              """)

# --------------------- PROGRAMA PRINCIPAL

contratos_doacao = ["d1", "d2", "d3", "d4", "d5"] # Contratos disponíveis (informação que será cedida pelo banco de dados)
contratos_veiculos = ["v1", "v2", "v3", "v4"] # Contratos disponíveis (informação que será cedida pelo banco de dados)

# O Programa só funcionará se existirem contratos de doações disponíveis
while len(contratos_doacao) > 0:
    contrato_escolhido = escolha_cd(contratos_doacao) # Escolher um dos contratos
    d_contratos(contrato_escolhido)
    print("""Escolhendo o melhor veículo para este contrato...
...
...""") # Simula uma possível escolha da IA de um melhor veículo à disposição
    if len(contratos_veiculos) > 0:
        veiculo_escolhido = veiculo_aleatorio(contratos_veiculos) # Simula a melhor escolha da IA de forma aleatória
        v_contratos(veiculo_escolhido)
        print("""Calculando rotas...""") # Onde a IA vai fazer seu trabalho
        print("""
              --- CONTRATO FINALIZADO ---
              """)
    else:
        print("Não há veículos disponíveis para a realização desse contrato") # Caso não haja veículos restantes
    contratos_doacao.remove(contrato_escolhido)
    print(f"""Contratos restantes: {contratos_doacao}
          """)