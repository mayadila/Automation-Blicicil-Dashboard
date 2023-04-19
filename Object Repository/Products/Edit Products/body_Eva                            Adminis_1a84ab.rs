<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_Eva                            Adminis_1a84ab</name>
   <tag></tag>
   <elementGuidId>716f5824-2227-47a8-9d53-149a2f518413</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body.vertical-layout.vertical-menu-modern.navbar-floating.footer-static.menu-expanded.pace-done</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
      <webElementGuid>5152f2df-ba30-4097-9e62-5cfb3f156976</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>vertical-layout vertical-menu-modern navbar-floating footer-static menu-expanded pace-done</value>
      <webElementGuid>5431c77a-81b9-4de2-a9fc-3d78c6a5aaea</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-open</name>
      <type>Main</type>
      <value>click</value>
      <webElementGuid>a65c6344-482d-44e9-81c5-57e694d4e5de</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>data-menu</name>
      <type>Main</type>
      <value>vertical-menu-modern</value>
      <webElementGuid>1a59aec3-ddc8-4013-ba02-90870a3f8cfa</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
  


    
        
            
                
                    
                        
                            
                        
                    
                
            
            
                
                    
                        
                            Eva
                            Administrator
                        
                        
                            E
                        
                    
                    
                        
                             Logout
                        
                    
                
            
        
    
    
        
            
                
                    
                        Blicicil
                    
                
                
                    
                        
                        
                    
                
            
        
        
        
            
                
										
											
											Dashboard
										
									
				    			
				    				
										
											
											Customer Management
										
									
				    			
		    						
										
											
											Master
										
										
			    							
							                	
							                		
							                		Merchants
							                	
							                
			    						
			    							
							                	
							                		
							                		Merchant Offers
							                	
							                
			    						
			    							
							                	
							                		
							                		Toko
							                	
							                
			    						
			    							
							                	
							                		
							                		Kategori Toko
							                	
							                
			    						
			    							
							                	
							                		
							                		Kategori
							                	
							                
			    						
			    							
							                	
							                		
							                		Bank
							                	
							                
			    						
			    							
							                	
							                		
							                		Highlight
							                	
							                
			    						
			    							
							                	
							                		
							                		Headline
							                	
							                
			    						
									
		    					
		    						
										
											
											Transaction
										
										
			    							
							                	
							                		
							                		Motorcycle
							                	
							                
			    						
									
		    					
				    				
										
											
											Products
										
									
				    			
				    				
										
											
											Products Status
										
									
				    			
				    				
										
											
											News
										
									
				    			
				    				
										
											
											Special Offers
										
									
				    			
				    				
										
											
											FAQ
										
									
				    			
		    						
										
											
											Config
										
										
			    							
							                	
							                		
							                		Administrator
							                	
							                
			    						
			    							
							                	
							                		
							                		Main Config
							                	
							                
			    						
			    							
							                	
							                		
							                		Wording Notification
							                	
							                
			    						
									
		    					

            
        
    
   
        
        
        
            
                
                    
                        
                            
                            
                                
                                    Home
                                    Products
                                    Edit
                                
                            
                        
                    
                
            
            
                
                    
                        
                            
                                
                                    
                                        Edit Product BliCicil Admin as
                                    
                                
                                
                                    
                                        
                                            Product Image
                                            
                                                
                                            
                                            
                                                File Size : Max 1 Mb ( 40 x 40 px )
                                                File Format : PNG, JPG
                                                
                                                    
                                                    images.jpg
                                                
                                            
                                        
                                        
                                            Product Name
                                            
                                                
                                                    
                                                
                                            
                                        

                                        
                                            Product Slug
                                            
                                                
                                                    
                                                
                                            
                                        

                                        
                                            Product Desc
                                            
                                                
                                                    
                                                    
                                                

                                            
                                        
                                        
                                        
                                            
                                                
                                                    
                                                    Submit
                                                
                                            
                                        
                                    
                                
                            
                        
                    
                
            
        
    

    

    
    
        
            COPYRIGHT © 2020
                Blicicil
                , All rights Reserved
            
            Develop by Andre Pabertiyan
        
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
        $(window).on('load', function() {
            if (feather) {
                feather.replace({
                    width: 14,
                    height: 14
                });
            }
        })
    
    

        
        var globalArray = new Array();
        $('#frmProduct').submit(function(){
            const isImageEmpty = $(&quot;#ProductImage&quot;).attr('src') ===
                'https://uat-dashboard.blicicil.com/assets/images/default.png';
            const productImage = $('#ProductImage').attr('src').includes('https://blicicil');
            if (isImageEmpty) {
                showAlert('Please upload product image','Warning!' , 'warning');
                return;
            }
            var postData = new FormData();
            postData.append(&quot;page_url&quot;, 'Edit');
            postData.append(&quot;txtProductImage&quot;, productImage ? undefined : $('#txtProductImage')[0].files[0]);
            postData.append(&quot;txtProductName&quot;, $('#txtProductName').val().trim());
            postData.append(&quot;txtProductSlug&quot;, $('#txtProductSlug').val().trim());
            postData.append(&quot;txtProductDesc&quot;, $('#txtProductDesc').val().trim());
                            postData.append(&quot;page_id&quot;, '643e464694782805670677b2');
                        var form = document.getElementById(&quot;frmProduct&quot;);
            processingform(form);

            var checkboxes = document.getElementsByName('customCheck[]');
            var valueToPush = '';
            for (var i = 0, n = checkboxes.length; i &lt; n; i++) {
                if (checkboxes[i].checked) {
                    postData.append(&quot;customFile&quot;+i, $('#customFile'+i)[0].files[0]);
                    postData.append(&quot;desc&quot;+i, $('#desc'+i).val());
                    valueToPush = checkboxes[i].value + ',' + valueToPush;
                }
            }

            postData.append(&quot;valueToPush&quot;, valueToPush);

            ajax({
                url : &quot;https://uat-dashboard.blicicil.com/api/do-product&quot;,
                postData : postData,
                processData: false,
                contentType: false,
                success : function(ret){
                    showAlert(ret.msg).then(() => {
                        window.location.href = &quot;https://uat-dashboard.blicicil.com/products&quot;;
                    });
                },
                error: function(err){
                    unprocessingform(form);
                    showAlert(err.msg || 'Something went wrong!', 'Error!', 'error');
                }
            });
        });

        function onProductNameChange(){
            let productValue = $(&quot;#txtProductName&quot;).val();
            $(&quot;#txtProductSlug&quot;).val(convertToSlug(productValue))
        }
    


id(&quot;txtProductImage&quot;)</value>
      <webElementGuid>625009f7-5323-4096-822b-64f211055602</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;loaded&quot;]/body[@class=&quot;vertical-layout vertical-menu-modern navbar-floating footer-static menu-expanded pace-done&quot;]</value>
      <webElementGuid>6a2e0680-79f2-4336-8ea2-aa326184a59f</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
      <webElementGuid>8c067da7-98e6-4c9e-955f-e696b45c62c2</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//body[(text() = concat(&quot;
  


    
        
            
                
                    
                        
                            
                        
                    
                
            
            
                
                    
                        
                            Eva
                            Administrator
                        
                        
                            E
                        
                    
                    
                        
                             Logout
                        
                    
                
            
        
    
    
        
            
                
                    
                        Blicicil
                    
                
                
                    
                        
                        
                    
                
            
        
        
        
            
                
										
											
											Dashboard
										
									
				    			
				    				
										
											
											Customer Management
										
									
				    			
		    						
										
											
											Master
										
										
			    							
							                	
							                		
							                		Merchants
							                	
							                
			    						
			    							
							                	
							                		
							                		Merchant Offers
							                	
							                
			    						
			    							
							                	
							                		
							                		Toko
							                	
							                
			    						
			    							
							                	
							                		
							                		Kategori Toko
							                	
							                
			    						
			    							
							                	
							                		
							                		Kategori
							                	
							                
			    						
			    							
							                	
							                		
							                		Bank
							                	
							                
			    						
			    							
							                	
							                		
							                		Highlight
							                	
							                
			    						
			    							
							                	
							                		
							                		Headline
							                	
							                
			    						
									
		    					
		    						
										
											
											Transaction
										
										
			    							
							                	
							                		
							                		Motorcycle
							                	
							                
			    						
									
		    					
				    				
										
											
											Products
										
									
				    			
				    				
										
											
											Products Status
										
									
				    			
				    				
										
											
											News
										
									
				    			
				    				
										
											
											Special Offers
										
									
				    			
				    				
										
											
											FAQ
										
									
				    			
		    						
										
											
											Config
										
										
			    							
							                	
							                		
							                		Administrator
							                	
							                
			    						
			    							
							                	
							                		
							                		Main Config
							                	
							                
			    						
			    							
							                	
							                		
							                		Wording Notification
							                	
							                
			    						
									
		    					

            
        
    
   
        
        
        
            
                
                    
                        
                            
                            
                                
                                    Home
                                    Products
                                    Edit
                                
                            
                        
                    
                
            
            
                
                    
                        
                            
                                
                                    
                                        Edit Product BliCicil Admin as
                                    
                                
                                
                                    
                                        
                                            Product Image
                                            
                                                
                                            
                                            
                                                File Size : Max 1 Mb ( 40 x 40 px )
                                                File Format : PNG, JPG
                                                
                                                    
                                                    images.jpg
                                                
                                            
                                        
                                        
                                            Product Name
                                            
                                                
                                                    
                                                
                                            
                                        

                                        
                                            Product Slug
                                            
                                                
                                                    
                                                
                                            
                                        

                                        
                                            Product Desc
                                            
                                                
                                                    
                                                    
                                                

                                            
                                        
                                        
                                        
                                            
                                                
                                                    
                                                    Submit
                                                
                                            
                                        
                                    
                                
                            
                        
                    
                
            
        
    

    

    
    
        
            COPYRIGHT © 2020
                Blicicil
                , All rights Reserved
            
            Develop by Andre Pabertiyan
        
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
        $(window).on(&quot; , &quot;'&quot; , &quot;load&quot; , &quot;'&quot; , &quot;, function() {
            if (feather) {
                feather.replace({
                    width: 14,
                    height: 14
                });
            }
        })
    
    

        
        var globalArray = new Array();
        $(&quot; , &quot;'&quot; , &quot;#frmProduct&quot; , &quot;'&quot; , &quot;).submit(function(){
            const isImageEmpty = $(&quot;#ProductImage&quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;) ===
                &quot; , &quot;'&quot; , &quot;https://uat-dashboard.blicicil.com/assets/images/default.png&quot; , &quot;'&quot; , &quot;;
            const productImage = $(&quot; , &quot;'&quot; , &quot;#ProductImage&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;).includes(&quot; , &quot;'&quot; , &quot;https://blicicil&quot; , &quot;'&quot; , &quot;);
            if (isImageEmpty) {
                showAlert(&quot; , &quot;'&quot; , &quot;Please upload product image&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;Warning!&quot; , &quot;'&quot; , &quot; , &quot; , &quot;'&quot; , &quot;warning&quot; , &quot;'&quot; , &quot;);
                return;
            }
            var postData = new FormData();
            postData.append(&quot;page_url&quot;, &quot; , &quot;'&quot; , &quot;Edit&quot; , &quot;'&quot; , &quot;);
            postData.append(&quot;txtProductImage&quot;, productImage ? undefined : $(&quot; , &quot;'&quot; , &quot;#txtProductImage&quot; , &quot;'&quot; , &quot;)[0].files[0]);
            postData.append(&quot;txtProductName&quot;, $(&quot; , &quot;'&quot; , &quot;#txtProductName&quot; , &quot;'&quot; , &quot;).val().trim());
            postData.append(&quot;txtProductSlug&quot;, $(&quot; , &quot;'&quot; , &quot;#txtProductSlug&quot; , &quot;'&quot; , &quot;).val().trim());
            postData.append(&quot;txtProductDesc&quot;, $(&quot; , &quot;'&quot; , &quot;#txtProductDesc&quot; , &quot;'&quot; , &quot;).val().trim());
                            postData.append(&quot;page_id&quot;, &quot; , &quot;'&quot; , &quot;643e464694782805670677b2&quot; , &quot;'&quot; , &quot;);
                        var form = document.getElementById(&quot;frmProduct&quot;);
            processingform(form);

            var checkboxes = document.getElementsByName(&quot; , &quot;'&quot; , &quot;customCheck[]&quot; , &quot;'&quot; , &quot;);
            var valueToPush = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
            for (var i = 0, n = checkboxes.length; i &lt; n; i++) {
                if (checkboxes[i].checked) {
                    postData.append(&quot;customFile&quot;+i, $(&quot; , &quot;'&quot; , &quot;#customFile&quot; , &quot;'&quot; , &quot;+i)[0].files[0]);
                    postData.append(&quot;desc&quot;+i, $(&quot; , &quot;'&quot; , &quot;#desc&quot; , &quot;'&quot; , &quot;+i).val());
                    valueToPush = checkboxes[i].value + &quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot; + valueToPush;
                }
            }

            postData.append(&quot;valueToPush&quot;, valueToPush);

            ajax({
                url : &quot;https://uat-dashboard.blicicil.com/api/do-product&quot;,
                postData : postData,
                processData: false,
                contentType: false,
                success : function(ret){
                    showAlert(ret.msg).then(() => {
                        window.location.href = &quot;https://uat-dashboard.blicicil.com/products&quot;;
                    });
                },
                error: function(err){
                    unprocessingform(form);
                    showAlert(err.msg || &quot; , &quot;'&quot; , &quot;Something went wrong!&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;Error!&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;error&quot; , &quot;'&quot; , &quot;);
                }
            });
        });

        function onProductNameChange(){
            let productValue = $(&quot;#txtProductName&quot;).val();
            $(&quot;#txtProductSlug&quot;).val(convertToSlug(productValue))
        }
    


id(&quot;txtProductImage&quot;)&quot;) or . = concat(&quot;
  


    
        
            
                
                    
                        
                            
                        
                    
                
            
            
                
                    
                        
                            Eva
                            Administrator
                        
                        
                            E
                        
                    
                    
                        
                             Logout
                        
                    
                
            
        
    
    
        
            
                
                    
                        Blicicil
                    
                
                
                    
                        
                        
                    
                
            
        
        
        
            
                
										
											
											Dashboard
										
									
				    			
				    				
										
											
											Customer Management
										
									
				    			
		    						
										
											
											Master
										
										
			    							
							                	
							                		
							                		Merchants
							                	
							                
			    						
			    							
							                	
							                		
							                		Merchant Offers
							                	
							                
			    						
			    							
							                	
							                		
							                		Toko
							                	
							                
			    						
			    							
							                	
							                		
							                		Kategori Toko
							                	
							                
			    						
			    							
							                	
							                		
							                		Kategori
							                	
							                
			    						
			    							
							                	
							                		
							                		Bank
							                	
							                
			    						
			    							
							                	
							                		
							                		Highlight
							                	
							                
			    						
			    							
							                	
							                		
							                		Headline
							                	
							                
			    						
									
		    					
		    						
										
											
											Transaction
										
										
			    							
							                	
							                		
							                		Motorcycle
							                	
							                
			    						
									
		    					
				    				
										
											
											Products
										
									
				    			
				    				
										
											
											Products Status
										
									
				    			
				    				
										
											
											News
										
									
				    			
				    				
										
											
											Special Offers
										
									
				    			
				    				
										
											
											FAQ
										
									
				    			
		    						
										
											
											Config
										
										
			    							
							                	
							                		
							                		Administrator
							                	
							                
			    						
			    							
							                	
							                		
							                		Main Config
							                	
							                
			    						
			    							
							                	
							                		
							                		Wording Notification
							                	
							                
			    						
									
		    					

            
        
    
   
        
        
        
            
                
                    
                        
                            
                            
                                
                                    Home
                                    Products
                                    Edit
                                
                            
                        
                    
                
            
            
                
                    
                        
                            
                                
                                    
                                        Edit Product BliCicil Admin as
                                    
                                
                                
                                    
                                        
                                            Product Image
                                            
                                                
                                            
                                            
                                                File Size : Max 1 Mb ( 40 x 40 px )
                                                File Format : PNG, JPG
                                                
                                                    
                                                    images.jpg
                                                
                                            
                                        
                                        
                                            Product Name
                                            
                                                
                                                    
                                                
                                            
                                        

                                        
                                            Product Slug
                                            
                                                
                                                    
                                                
                                            
                                        

                                        
                                            Product Desc
                                            
                                                
                                                    
                                                    
                                                

                                            
                                        
                                        
                                        
                                            
                                                
                                                    
                                                    Submit
                                                
                                            
                                        
                                    
                                
                            
                        
                    
                
            
        
    

    

    
    
        
            COPYRIGHT © 2020
                Blicicil
                , All rights Reserved
            
            Develop by Andre Pabertiyan
        
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
        $(window).on(&quot; , &quot;'&quot; , &quot;load&quot; , &quot;'&quot; , &quot;, function() {
            if (feather) {
                feather.replace({
                    width: 14,
                    height: 14
                });
            }
        })
    
    

        
        var globalArray = new Array();
        $(&quot; , &quot;'&quot; , &quot;#frmProduct&quot; , &quot;'&quot; , &quot;).submit(function(){
            const isImageEmpty = $(&quot;#ProductImage&quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;) ===
                &quot; , &quot;'&quot; , &quot;https://uat-dashboard.blicicil.com/assets/images/default.png&quot; , &quot;'&quot; , &quot;;
            const productImage = $(&quot; , &quot;'&quot; , &quot;#ProductImage&quot; , &quot;'&quot; , &quot;).attr(&quot; , &quot;'&quot; , &quot;src&quot; , &quot;'&quot; , &quot;).includes(&quot; , &quot;'&quot; , &quot;https://blicicil&quot; , &quot;'&quot; , &quot;);
            if (isImageEmpty) {
                showAlert(&quot; , &quot;'&quot; , &quot;Please upload product image&quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot;Warning!&quot; , &quot;'&quot; , &quot; , &quot; , &quot;'&quot; , &quot;warning&quot; , &quot;'&quot; , &quot;);
                return;
            }
            var postData = new FormData();
            postData.append(&quot;page_url&quot;, &quot; , &quot;'&quot; , &quot;Edit&quot; , &quot;'&quot; , &quot;);
            postData.append(&quot;txtProductImage&quot;, productImage ? undefined : $(&quot; , &quot;'&quot; , &quot;#txtProductImage&quot; , &quot;'&quot; , &quot;)[0].files[0]);
            postData.append(&quot;txtProductName&quot;, $(&quot; , &quot;'&quot; , &quot;#txtProductName&quot; , &quot;'&quot; , &quot;).val().trim());
            postData.append(&quot;txtProductSlug&quot;, $(&quot; , &quot;'&quot; , &quot;#txtProductSlug&quot; , &quot;'&quot; , &quot;).val().trim());
            postData.append(&quot;txtProductDesc&quot;, $(&quot; , &quot;'&quot; , &quot;#txtProductDesc&quot; , &quot;'&quot; , &quot;).val().trim());
                            postData.append(&quot;page_id&quot;, &quot; , &quot;'&quot; , &quot;643e464694782805670677b2&quot; , &quot;'&quot; , &quot;);
                        var form = document.getElementById(&quot;frmProduct&quot;);
            processingform(form);

            var checkboxes = document.getElementsByName(&quot; , &quot;'&quot; , &quot;customCheck[]&quot; , &quot;'&quot; , &quot;);
            var valueToPush = &quot; , &quot;'&quot; , &quot;&quot; , &quot;'&quot; , &quot;;
            for (var i = 0, n = checkboxes.length; i &lt; n; i++) {
                if (checkboxes[i].checked) {
                    postData.append(&quot;customFile&quot;+i, $(&quot; , &quot;'&quot; , &quot;#customFile&quot; , &quot;'&quot; , &quot;+i)[0].files[0]);
                    postData.append(&quot;desc&quot;+i, $(&quot; , &quot;'&quot; , &quot;#desc&quot; , &quot;'&quot; , &quot;+i).val());
                    valueToPush = checkboxes[i].value + &quot; , &quot;'&quot; , &quot;,&quot; , &quot;'&quot; , &quot; + valueToPush;
                }
            }

            postData.append(&quot;valueToPush&quot;, valueToPush);

            ajax({
                url : &quot;https://uat-dashboard.blicicil.com/api/do-product&quot;,
                postData : postData,
                processData: false,
                contentType: false,
                success : function(ret){
                    showAlert(ret.msg).then(() => {
                        window.location.href = &quot;https://uat-dashboard.blicicil.com/products&quot;;
                    });
                },
                error: function(err){
                    unprocessingform(form);
                    showAlert(err.msg || &quot; , &quot;'&quot; , &quot;Something went wrong!&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;Error!&quot; , &quot;'&quot; , &quot;, &quot; , &quot;'&quot; , &quot;error&quot; , &quot;'&quot; , &quot;);
                }
            });
        });

        function onProductNameChange(){
            let productValue = $(&quot;#txtProductName&quot;).val();
            $(&quot;#txtProductSlug&quot;).val(convertToSlug(productValue))
        }
    


id(&quot;txtProductImage&quot;)&quot;))]</value>
      <webElementGuid>296e0984-7c74-41d4-ae50-77825838ba55</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
