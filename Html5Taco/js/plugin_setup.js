<script language="javascript">

		//Ranking plugin

		sort_ul = $('#sortable');
		itemsCount = $('#sortable li').length;
	
		function updateIndexes(){
		  $('#sortable li input').each(function(i){
			  $(this).val(i+1);
		  });
		}
		
		updateIndexes();
				 
		sort_ul.sortable({handle:'span', stop:function(event,ui){ updateIndexes();}});
		
		$('#sortable li input').keyup(function(event) {
		  if(event.keyCode == '13'){      
			event.preventDefault();
			  
			order = parseInt($(this).val());
			  
			li = $(this).parent();
			if(order>=1 && order <= itemsCount){      
				
				li.effect('drop', function(){
					li.detach();
						
					if(order == itemsCount)
						sort_ul.append(li);
					else
						li.insertBefore($('#sortable li:eq('+(order-1)+')'));
					
					updateIndexes();
					li.effect('slide');
				});
			}else{
				li.effect('highlight');
			}
		  }    
		});

</script>