package SeparateFunction;

import java.awt.List;
import java.util.ArrayList;

public class SeparateStringWithSplit {
	
	public static void main(String[] args) {
		
		String s="Good luck with this case!!! h jrkjc c l m e i vct h ss pqk_v i olf tuoej_          p r jrpjpuo a.          udc mu tk g dc,          j o mui brljn!jv p rsklqu p?a lv l n dl quo!cml pld qf l s!          t nb ud j etc q           a j f ugc eer c,          ci de lm p iwk_nwa e su s u ga.l w xlkod f e v_          oo ukaa v t xe.          j cl vmh hi tl!          xa aw ugeibo?c r oo v qte ri,          elbf ibg qk i_m nm s ainis s           u m rhd fgi h v!          mji tu oj t c d.x hxtp a bf xj.          l j ela wuj is           pj gu fs e o v i,s s i b k kab tw@          im c vlud k ki!          e ft gpcf t g k'          m c r snv w b rw,hwoh dfl hn u@cb ep ucsse j_          a d h q p w q rjp_          tln j vofvwg_sj rx pur l dx_          vo b lk sljnm?          k xox i cv va l,          du toe sdwx g@c s uded gw od!          tqsv v t v fnl'          o amka ll x s q_          a frs s ltubs?wdjfdrf x jk.jgkb d s d k n m@sedwkpe ev h_icr ggqxvap@          j g hva o kja q?          j j q ra iak c u!          vqnf ts";
		
		
		String[] separatedArray=s.split("[\\W]+");;
		
		
			
		
		
		ArrayList<String> finalWithoutSpace=new ArrayList<String>();
		int count=0;
		
		
		for (String string : separatedArray) {
		
				if(string.isEmpty()) {
					continue;
				}
				else if(string.contains("_")) {
					
					System.out.println(string);
					/*String[] tempArray=string.split("_");
					for (String string2 : tempArray) {
						System.out.println(string2);
						finalWithoutSpace.add(string2);
						count++;
					}*/
				}
				else {
					finalWithoutSpace.add(string);
					count++;
				}
		}
		
		
		System.out.println(count);
		/*for (String string : finalWithoutSpace) {
			System.out.println(string);
		}*/
		
		
	}

}
