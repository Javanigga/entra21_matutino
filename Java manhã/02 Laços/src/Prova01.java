import java.util.Scanner;

public class Prova01 {

	public static void main(String[] args) {

		Scanner textos = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);

		double vAudVid = 0;
		double vVest = 0;
		double vInfo = 0;
		double vTele = 0;
		double valorTotal = 0;
		double valor = 0;
		double totalFinal = 0;
		double maiorCompra = 0;
		double menorCompra = 999999999;

		String nome = "";
		String maiorComprador = "";
		String menorComprador = "";
		String empt = "";

		int subDep = 0;
		int dep = 0;
		int qntDep1 = 0;
		int qntDep2 = 0;
		int qntDep3 = 0;
		int qntDep4 = 0;
		int qnt = 0;
		int saida = 0;
		int cadCliente = 0;
		int sexo = 0;
		int fem = 0;
		int masc = 0;
		int zeroDezessete = 0;
		int dezoTrinta = 0;
		int triumCinq = 0;
		int mCinq = 0;

		boolean sair = false;

		System.out.println("Iniciar o sistema? 1)Sim | 2)Não");
		saida = numeros.nextInt();
		if (saida == 2) {
			sair = true;
			System.out.println("Não foi executada nenhuma venda.");
		} else {
			while (sair == false) {
				System.out.print("Insira o seu nome: ");
				nome = textos.nextLine();

				while (nome.equals(empt)) {
					System.out.print("Por favor, insira o seu nome:");
					nome = textos.nextLine();
				}

				System.out.println("1)Masculino 2)Feminino");
				System.out.print("Insira o sexo : ");
				sexo = numeros.nextInt();
				if (sexo <= 0 || sexo > 2) {
					while (sexo <= 0 || sexo > 2) {
						System.out.println("Insira um sexo válido:");
						sexo = numeros.nextInt();
					}
				}
				if (sexo == 1) {
					masc++;
				}
				if (sexo == 2) {
					fem++;
				}
				// if sexo

				System.out.print("Insira a sua idade:");
				int idade = numeros.nextInt();
				if (idade < 0) {
					while (idade < 0) {
						System.out.println("Por favor, insira uma idade válida");
						idade = numeros.nextInt();
					}
				}
				if (idade >= 0 && idade <= 17) {
					zeroDezessete++;
				}
				if (idade >= 18 && idade <= 30) {
					dezoTrinta++;
				}
				if (idade >= 31 && idade <= 50) {
					triumCinq++;
				}
				if (idade > 50) {
					mCinq++;
				} // if idade

				while (dep != 5) {
					System.out.println("1)Áudio e Vídeo | 2)Informática | 3)Telefonia | 4)Vestuário | 5)Sair");
					System.out.print("Escolha um departamento:");
					dep = numeros.nextInt();

					if (dep == 1) {
						System.out.println("1)TVs | 2)Aparelhos de som | 3)Departamentos");
						System.out.print("Escolha um sub-departamento:");
						subDep = numeros.nextInt();
						while (subDep != 3) {
							if (subDep == 1) {
								System.out.println(
										"1)Smart TV Led 49 Samsung - R$4.999,99 \n2)Smart TV 4K LG 60 - R$7.499,00 \n3)Smart TV Full HD 32 Samsung - R$ 1.710,00 \n4)Retornar");
								System.out.print("Escolha um produto:");
								int prod = numeros.nextInt();
								if (prod == 1) {
									System.out.print("Insira a quantidade desejada:");
									qnt = numeros.nextInt();
									valor = 4999.99 * qnt;
									valorTotal += valor;
									vAudVid += valor;
									qntDep1 += qnt;
								}
								if (prod == 2) {
									System.out.print("Insira a quantidade desejada:");
									qnt = numeros.nextInt();
									valor = 7499 * qnt;
									valorTotal += valor;
									vAudVid += valor;
									qntDep1 += qnt;
								}
								if (prod == 3) {
									System.out.print("Insira a quantidade desejada:");
									qnt = numeros.nextInt();
									valor = 1710 * qnt;
									valorTotal += valor;
									vAudVid += valor;
									qntDep1 += qnt;
								}
								if (prod == 4) {
									System.out.println("1)TVs | 2)Aparelhos de som | 3)Departamentos");
									System.out.print("Escolha um sub-departamento:");
									subDep = numeros.nextInt();
								}

							}
							if (subDep == 2) {
								System.out.println(
										"1)Semp Toshiba Áudio Bright - R$ 599,99 \n2)Mini System LG - R$ 512,00 \n3)Mini System Philco - R$ 499,99 \n4)Retornar");
								System.out.print("Escolha um produto:");
								int prod = numeros.nextInt();
								if (prod == 1) {
									System.out.print("Insira a quantidade desejada:");
									qnt = numeros.nextInt();
									valor = 599.99 * qnt;
									valorTotal += valor;
									vAudVid += valor;
									qntDep1 += qnt;
								}
								if (prod == 2) {
									System.out.print("Insira a quantidade desejada:");
									qnt = numeros.nextInt();
									valor = 512 * qnt;
									valorTotal += valor;
									vAudVid += valor;
									qntDep1 += qnt;
								}
								if (prod == 3) {
									System.out.print("Insira a quantidade desejada:");
									qnt = numeros.nextInt();
									valor = 499.99 * qnt;
									valorTotal += valor;
									vAudVid += valor;
									qntDep1 += qnt;
								}
								if (prod == 4) {
									System.out.println("1)TVs | 2)Aparelhos de som | 3)Departamentos");
									System.out.print("Escolha um sub-departamento:");
									subDep = numeros.nextInt();
								}
							}
							if (subDep > 3) {
								while (subDep > 3) {
									System.out.println("1)TVs | 2)Aparelhos de som | 3)Departamentos");
									System.out.print("Insira um sub-departamento válido:");
									subDep = numeros.nextInt();
								}
							}
						} // if dep 1
					}

					if (dep == 2) {
						System.out.println("1)Hardware | 2)Software | 3)Departamentos");
						System.out.print("Escolha um sub-departamento:");
						subDep = numeros.nextInt();
						if (subDep == 1) {
							System.out.println(
									"1)Placa Mãe Asus - R$ 2.000,00  \n2)Memória Ram Corsair 4GB - R$500,00  \n3)Mouse Multilaser - R$59,90 \n4)Retornar");
							System.out.print("Escolha um produto:");
							int prod = numeros.nextInt();
							if (prod == 1) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 2000 * qnt;
								valorTotal += valor;
								vInfo += valor;
								qntDep2 += qnt;
							}
							if (prod == 2) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 500 * qnt;
								valorTotal += valor;
								vInfo += valor;
								qntDep2 += qnt;
							}
							if (prod == 3) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 59.9 * qnt;
								valorTotal += valor;
								vInfo += valor;
								qntDep2 += qnt;
							}
							if (prod == 4) {
								System.out.println("1)Hardware | 2)Software | 3)Departamentos");
								System.out.print("Escolha um sub-departamento:");
								subDep = numeros.nextInt();
							}

						}
						if (subDep == 2) {
							System.out.println(
									"1)Windows 10  - R$500,00 \n2)Office 2019 - R$399,99 \n3)AutoCad 3D - R$899,50 \n4)Retornar");
							System.out.print("Escolha um produto:");
							int prod = numeros.nextInt();
							if (prod == 1) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 500 * qnt;
								valorTotal += valor;
								vInfo += valor;
								qntDep2 += qnt;
							}
							if (prod == 2) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 399.99 * qnt;
								valorTotal += valor;
								vInfo += valor;
								qntDep2 += qnt;
							}
							if (prod == 3) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 899.50 * qnt;
								valorTotal += valor;
								vInfo += valor;
								qntDep2 += qnt;
							}
							if (prod == 4) {
								System.out.println("1)Hardware | 2)Software | 3)Departamentos");
								System.out.print("Escolha um sub-departamento:");
								subDep = numeros.nextInt();
							}

						}

					} // if dep 2

					if (dep == 3) {
						System.out.println("1)Smartphones | 2)Tablets | 3)Departamentos");
						System.out.print("Escolha um sub-departamento:");
						subDep = numeros.nextInt();
						if (subDep == 1) {
							System.out.println(
									"1)Xiaomi Redmi 4X 32GB - R$670,00  \n2)Samsung Note S7 32GB - R$849,99  \n3)Iphone 7 16GB - R$1.789,99 \n4)Retornar ");
							System.out.print("Escolha um produto:");
							int prod = numeros.nextInt();
							if (prod == 1) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 670 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep3 += qnt;
							}
							if (prod == 2) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 849.99 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep3 += qnt;
							}
							if (prod == 3) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 1789.99 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep3 += qnt;
							}
							if (prod == 4) {
								System.out.println("1)Smartphones | 2)Tablets | 3)Departamentos");
								System.out.print("Escolha um sub-departamento:");
								subDep = numeros.nextInt();
							}

						}
						if (subDep == 2) {
							System.out.println(
									"1)Tablet Multilaser 8GB - R$349,00 \n2)Tablet Samsung 32GB - R$569,99 \n3)Tablet Kids 8GB - R$329,99 \n4)Retornar");
							System.out.print("Escolha um produto:");
							int prod = numeros.nextInt();
							if (prod == 1) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 349 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep3 += qnt;
							}
							if (prod == 2) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 569.99 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep3 += qnt;
							}
							if (prod == 3) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 329.99 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep3 += qnt;
							}
							if (prod == 4) {
								System.out.println("1)Smartphones | 2)Tablets | 3)Departamentos");
								System.out.print("Escolha um sub-departamento:");
								subDep = numeros.nextInt();
							}

						}

					} // if dep 3

					if (dep == 4) {
						System.out.println("1)Masculino | 2)Feminino | 3)Departamentos");
						System.out.print("Escolha um sub-departamento:");
						subDep = numeros.nextInt();
						if (subDep == 1) {
							System.out.println(
									"1)Camisa Social Lacoste - R$ 200,00  \n2)Calça Jeans Calvin Klein R$ 230,00  \n3) Camisa Social Dudalina - R$ 130,00 \n4)Retornar");
							System.out.print("Escolha um produto:");
							int prod = numeros.nextInt();
							if (prod == 1) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 200 * qnt;
								valorTotal += valor;
								vVest += valor;
								qntDep4 += qnt;
							}
							if (prod == 2) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 230 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep4 += qnt;
							}
							if (prod == 3) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 130 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep4 += qnt;
							}
							if (prod == 4) {
								System.out.println("1)Masculino | 2)Feminino | 3)Departamentos");
								System.out.print("Escolha um sub-departamento:");
								subDep = numeros.nextInt();
							}

						}
						if (subDep == 2) {
							System.out.println(
									"1)Camisa Social Dudalina - R$170,00  \n2)Calça Jeans Miss Masi - R$ 99,90 \n3)Bermuda Dijean - R$ 74,40 \n4)Retornar");
							System.out.print("Escolha um produto:");
							int prod = numeros.nextInt();
							if (prod == 1) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 170 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep4 += qnt;
							}
							if (prod == 2) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 99.90 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep4 += qnt;
							}
							if (prod == 3) {
								System.out.print("Insira a quantidade desejada:");
								qnt = numeros.nextInt();
								valor = 74.40 * qnt;
								valorTotal += valor;
								vTele += valor;
								qntDep4 += qnt;
							}
							if (prod == 4) {
								System.out.println("1)Masculino | 2)Feminino ");
								System.out.print("Escolha um sub-departamento:");
								subDep = numeros.nextInt();
							}

						}

					} // if dep 4
				} // while

				System.out.println("1)A vista | 2)A prazo");
				System.out.print("Selecione o meio de pagamento");
				int mPag = numeros.nextInt();

				if (mPag == 1) {
					vAudVid *= 0.95;
					vInfo *= 0.9;
					vTele *= 0.85;
					vVest *= 0.8;

					totalFinal = vAudVid + vInfo + vVest;

					System.out.println("Total a ser pago: R$" + totalFinal);
					System.out.print("Insira o pagamento:");
					double pagamento = numeros.nextDouble();
					if (pagamento < totalFinal) {
						while (pagamento < totalFinal) {
							System.out.print("Por favor, insira um valor válido:");
							pagamento = numeros.nextDouble();
						}
					}
				} // if mpag 1

				if (mPag == 2) {
					totalFinal = valorTotal;
					System.out.println("Total a ser pago: R$" + totalFinal);
					System.out.print("Insira o pagamento:");
					double pagamento = numeros.nextDouble();
					if (pagamento < totalFinal) {
						while (pagamento < totalFinal) {
							System.out.print("Por favor, insira um valor válido:");
							pagamento = numeros.nextDouble();
						}
					}
				} // if mpag 2

				if (totalFinal > maiorCompra) {
					maiorCompra = totalFinal;
					maiorComprador = nome;

				}

				if (totalFinal < menorCompra) {
					menorCompra = totalFinal;
					menorComprador = nome;
				}

				System.out.println("1)Sim | 2)Não");
				System.out.print("Finalizar o programa?");
				saida = numeros.nextInt();

				if (saida == 1) {
					sair = true;
					cadCliente++;
				} else {
					cadCliente++;
					dep = dep - dep;
					subDep = subDep - subDep;
					totalFinal = totalFinal - totalFinal;
					valorTotal = valorTotal - valorTotal;
					vAudVid = vAudVid - vAudVid;
					vInfo = vInfo - vInfo;
					vTele = vTele - vTele;
					vVest = vVest - vVest;
				}
				System.out.println(totalFinal);
			} // while

			System.out.println("");
			System.out.println("Número de clientes que utilizaram o sistema: " + cadCliente);
			System.out.println("Quantidade de Mulheres: " + fem + ", ou " + (fem * 100) / cadCliente + "%");
			System.out.println("Quantidade de Homens: " + masc + ", ou " + (masc * 100) / cadCliente + "%");

			System.out.println("");

			System.out.println("Até 17 anos:" + zeroDezessete);
			System.out.println("Entre 18 e 30 anos: " + dezoTrinta);
			System.out.println("Entre 31 e 50: " + triumCinq);
			System.out.println("Maior que 50: " + mCinq);

			System.out.println("");

			System.out.println("Maior comprador:" + maiorComprador + ", com o gasto de R$" + maiorCompra);
			System.out.println("Menor comprador:" + menorComprador + ", com o gasto de R$" + menorCompra);

			System.out.println("");

			System.out.println("Produtos adquiridos por departamento:");
			System.out.println("Áudio/Vídeo: " + qntDep1);
			System.out.println("Informática: " + qntDep2);
			System.out.println("Telefonia: " + qntDep3);
			System.out.println("Vestuário: " + qntDep4);
			
			textos.close();
			numeros.close();
		}
	}
}
