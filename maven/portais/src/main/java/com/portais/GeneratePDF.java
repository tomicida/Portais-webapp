package com.portais;
import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Font;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class GeneratePDF {

    PdfWriter writer;
    Leitura leitura;
    Document doc;

    public GeneratePDF(Leitura leitura, TreeRoot root) {
        Document doc = new Document();
        Paragraph paragraph;
        try{
            Font fontb = new Font(Font.FontFamily.HELVETICA, 13, Font.BOLD);
            Font fontn = new Font(Font.FontFamily.HELVETICA, 11, Font.NORMAL);
            Font fontul = new Font(Font.FontFamily.HELVETICA, 12, Font.UNDERLINE);
            String[] tempo = {"meses", "semanas" ,"dias", "horas"};
            writer = PdfWriter.getInstance(doc, new FileOutputStream("portais/reports/"+leitura.filename+".pdf"));
            doc.open();

            paragraph = new Paragraph("Relatório de Mesa Radiónica Cura Quântica Multidimensional",new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD));
            paragraph.setAlignment(Element.ALIGN_CENTER);
            paragraph.setSpacingAfter(24f);
            doc.add(paragraph);


            PdfPTable table = new PdfPTable(2);
            table.addCell("Nome do Consulente");
            table.addCell(leitura.cliente.nome);

            table.addCell("Morada");
            table.addCell(leitura.cliente.morada);

            table.addCell("Nome do Terapeuta");
            table.addCell(leitura.cliente.nomeTerapeuta);

            table.addCell("Nome do Espaço");
            table.addCell(leitura.cliente.nomeEspaço);

            table.addCell("Hora de Inicio da Leitura");
            table.addCell(leitura.startTime.toString());

            table.addCell("Hora de Conclusão da Leitura");
            table.addCell(leitura.finishTime.toString());

            table.setSpacingAfter(12f);

            doc.add(table);

            table = new PdfPTable(6);

            table.addCell("Planos");
            table.addCell("1ª Leitura");
            table.addCell("2ª Leitura");
            table.addCell("Chakra");
            table.addCell("1ª Leitura");
            table.addCell("2ª Leitura");

            table.addCell("Plano Fisico");
            table.addCell(""+leitura.cliente.planoFisico1);
            table.addCell(""+leitura.cliente.planoFisico2);
            table.addCell("Coronário");
            table.addCell(""+leitura.cliente.chakraCoronário1);
            table.addCell(""+leitura.cliente.chakraCoronário2);

            table.addCell("Plano Mental");
            table.addCell(""+leitura.cliente.planoMental1);
            table.addCell(""+leitura.cliente.planoMental2);
            table.addCell("Frontal");
            table.addCell(""+leitura.cliente.chakraFrontal1);
            table.addCell(""+leitura.cliente.chakraFrontal2);

            table.addCell("Plano Emocional");
            table.addCell(""+leitura.cliente.planoEmocional1);
            table.addCell(""+leitura.cliente.planoEmocional2);
            table.addCell("Laríngeo");
            table.addCell(""+leitura.cliente.chakraLaríngeo1);
            table.addCell(""+leitura.cliente.chakraLaríngeo2);

            table.addCell("Plano Espiritual");
            table.addCell(""+leitura.cliente.planoEspiritual1);
            table.addCell(""+leitura.cliente.planoEspiritual2);
            table.addCell("Cardíaco");
            table.addCell(""+leitura.cliente.chakraCardíaco1);
            table.addCell(""+leitura.cliente.chakraCardíaco2);

            table.addCell("Plano Profissional");
            table.addCell(""+leitura.cliente.planoProfissional1);
            table.addCell(""+leitura.cliente.planoProfissional2);
            table.addCell("Solar");
            table.addCell(""+leitura.cliente.chakraSolar1);
            table.addCell(""+leitura.cliente.chakraSolar2);

            table.addCell("Plano Financeiro");
            table.addCell(""+leitura.cliente.planoFinanceiro1);
            table.addCell(""+leitura.cliente.planoFinanceiro2);
            table.addCell("Umbilical");
            table.addCell(""+leitura.cliente.chakraUmbilical1);
            table.addCell(""+leitura.cliente.chakraUmbilical2);

            table.addCell("Influências Neg. Ext");
            table.addCell(""+leitura.cliente.influenNegExt1);
            table.addCell(""+leitura.cliente.influenNegExt2);
            table.addCell("Raiz");
            table.addCell(""+leitura.cliente.chakraRaiz1);
            table.addCell(""+leitura.cliente.chakraRaiz2);

            table.addCell("Influências Neg. Int.");
            table.addCell(""+leitura.cliente.influenNegInt1);
            table.addCell(""+leitura.cliente.influenNegInt2);
            
            table.setSpacingAfter(24f);

            doc.add(table);

            if(!leitura.observations.isEmpty()){
                paragraph = new Paragraph("Observações: ",new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
                paragraph.setSpacingAfter(12f);
                doc.add(paragraph);
                
                paragraph = new Paragraph(""+leitura.observations,fontn);
                paragraph.setSpacingAfter(12f);
                doc.add(paragraph);
            }

            paragraph = new Paragraph("Relatório:",new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD));
            paragraph.setSpacingAfter(12f);

            doc.add(paragraph);

            Portal portal;
            Portal lastPortal = new Portal("",9);
            Ferramenta ferramenta;
            Ferramenta lastTool = new Ferramenta("", lastPortal, 19);
            Paragraph tempParagraph;

            for (ArrayList<Integer> lista : leitura.historico) {
                portal = root.portais.get(lista.get(0));
                ferramenta = portal.ferramentas.get(lista.get(1));
                tempParagraph = new Paragraph();

                System.out.println(lista.toString());

                if(portal == lastPortal){
                    tempParagraph.add(new Chunk("           ",fontn));
                }
                else{
                    tempParagraph.add(new Chunk(portal.name,fontb));
                    tempParagraph.add(new Chunk("\n           ",fontn));
                    tempParagraph.setSpacingBefore(6f);
                }
                if(ferramenta == lastTool){
                    tempParagraph.add(new Chunk("           ",fontn));
                }
                else{
                    tempParagraph.add(new Chunk(ferramenta.name,fontul));
                    tempParagraph.add(new Chunk("\n                      ",fontn));
                    tempParagraph.setSpacingBefore(3f);
                }

                if(ferramenta.type == 0 || ferramenta.type == 3){
                    tempParagraph.add(new Chunk(ferramenta.resultados.get(lista.get(2)),fontn));
                    if(!ferramenta.ações.isEmpty())
                        tempParagraph.add(new Chunk("; "+ferramenta.ações.get(lista.get(2)),fontn));     
                }else if (ferramenta.type == 2){
                    if(lista.size() >=3){
                        tempParagraph.add(new Chunk(ferramenta.resultados.get(lista.get(2)),fontn));
                        if (lista.size() >=4 ){
                            tempParagraph.add(new Chunk(" " + ferramenta.subFerramentas.get(lista.get(2)).resultados.get(lista.get(3)),fontn));
                            if (lista.size() >= 5 && !(lista.get(0)==2 && lista.get(1)==7)){
                                if(ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).type != 1)
                                    tempParagraph.add(new Chunk(" " + ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).resultados.get(lista.get(4)),fontn));
                                if(lista.size() >= 6){
                                    tempParagraph.add(new Chunk(" " + ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).subFerramentas.get(lista.get(4)).resultados.get(lista.get(5)),fontn));
                                    if(!ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).subFerramentas.get(lista.get(4)).ações.isEmpty())
                                        tempParagraph.add(new Chunk("; "+ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).subFerramentas.get(lista.get(4)).ações.get(lista.get(5)),fontn));
                                }
                                if(!ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).ações.isEmpty())
                                    tempParagraph.add(new Chunk("; "+ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).ações.get(lista.get(4)),fontn));   
                                if(ferramenta.subFerramentas.get(lista.get(2)).subFerramentas.get(lista.get(3)).type == 1)
                                    tempParagraph.add(new Chunk("; " + leitura.strings.get(lista.get(4)),fontn));
                            }
                            if(!ferramenta.subFerramentas.get(lista.get(2)).ações.isEmpty())
                                tempParagraph.add(new Chunk("; "+ferramenta.subFerramentas.get(lista.get(2)).ações.get(lista.get(3)),fontn));
                        }
                        if(!ferramenta.ações.isEmpty())
                            tempParagraph.add(new Chunk(": "+ferramenta.ações.get(lista.get(2)),fontn));
                    } 

                }else if (ferramenta.type ==4){
                    tempParagraph.add(new Chunk(lista.get(2)+"."+lista.get(3)+"."+lista.get(4)+": ",fontn));
                    tempParagraph.add(new Chunk(lista.get(5)+" - "+ferramenta.subFerramentas.get(0).resultados.get(lista.get(5)-1)+"; ",fontn));
                    tempParagraph.add(new Chunk(lista.get(6)+" - "+ferramenta.subFerramentas.get(1).resultados.get(lista.get(6)-1)+"; ",fontn));
                    tempParagraph.add(new Chunk(lista.get(7)+" - "+ferramenta.subFerramentas.get(2).resultados.get(lista.get(7)-1),fontn));
                    tempParagraph.add(new Chunk(" => "+lista.get(8)+" - "+ferramenta.subFerramentas.get(3).resultados.get(lista.get(8)-1),fontn));
                }

                if(portal.id == 1){
                    if(ferramenta.id == 0 || ferramenta.id == 1){
                        tempParagraph.add(new Chunk(", " + lista.get(3)+" "+tempo[lista.get(4)],fontn));
                    }
                }/* //MaybeRemove
                else if (portal.id == 3){
                    if(ferramenta.id == 0){
                        tempParagraph.add(new Chunk(", " + lista.get(3)+" vezes ao dia por "+lista.get(4)+ " dias, "+lista.get(5)+ " semanas, "+lista.get(6)+ " meses",fontn));
                    }
                }*/

                paragraph= tempParagraph;

                lastPortal = portal;
                lastTool = ferramenta;
                doc.add(paragraph);
            }
            
            doc.close();
            writer.close();
        }
            catch (Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
