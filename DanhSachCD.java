p a c k a g e   i u h . f i t . w e e k 3 ;  
  
 i m p o r t   j a v a . u t i l . A r r a y s ;  
 i m p o r t   j a v a . u t i l . C o m p a r a t o r ;  
  
 p u b l i c   c l a s s   D a n h S a c h C D   {  
 	  
 	 p r i v a t e   C D [ ]   d s C D ;  
 	 p r i v a t e   i n t   d e m   =   0 ;  
 	  
 	 p u b l i c   D a n h S a c h C D ( i n t   n )   {  
 	 	 i f ( n   <   0 )  
 	 	 	 t h r o w   n e w   R u n t i m e E x c e p t i o n ( " K � c h   t h ��c   m �n g   >   0 " ) ;  
 	 	 d s C D   =   n e w   C D [ n ] ;  
 	 }  
 	  
 	 p u b l i c   v o i d   t h e m C D ( C D   c d )   {  
 	 	 i f ( c d   = =   n u l l )  
 	 	 	 t h r o w   n e w   R u n t i m e E x c e p t i o n ( " C D   p h �i   k h � c   n u l l " ) ;  
 	 	  
 / / 	 	 k i e m   t r a   t r u n g   m a  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   d e m ;   i + + )   {  
 	 	 	 C D   t e m p   =   d s C D [ i ] ;  
 	 	 	 i f ( c d . g e t M a C D ( )   = =   t e m p . g e t M a C D ( ) )  
 	 	 	 	 t h r o w   n e w   R u n t i m e E x c e p t i o n ( " T r � n g   m �   C D   n u l l " ) ;  
 	 	 }  
 	 	  
 / / 	 	 K i e m   t r a   m a n g   c o   b i   d a y   k h o n g  
 	 	 i f ( d e m   = =   d s C D . l e n g t h )  
 / / 	 	 	 t h r o w   n e w   R u n t i m e E x c e p t i o n ( " M �n g   �y " ) ;  
 	 	 { / / T a n g   k i c h   t h u o c   m a n g   l e n   1 . 5  
 	 	 	 i n t   n e w L e n g t h   =   ( i n t ) ( d s C D . l e n g t h   *   1 . 5 ) ;   / / c a s t i n g  
 	 	 	 C D [ ]   t e m p   =   n e w   C D [ n e w L e n g t h ] ;  
 	 	 	 f o r   ( i n t   i   =   0 ;   i   <   d s C D . l e n g t h ;   i + + )   {  
 	 	 	 	 t e m p [ i ]   =   d s C D [ i ] ;  
 	 	 	 }  
 	 	 	  
 	 	 	 d s C D   =   t e m p ;  
 	 	 }  
 	 	  
 / / 	 	 T h e m   t h a n h   c o n g  
 	 	 d s C D [ d e m + + ]   =   c d ;  
 	 }  
 	  
 	 p u b l i c   C D [ ]   g e t D S C D ( )   {  
 	 	 r e t u r n   d s C D ;  
 	 }  
 	  
 	 p u b l i c   v o i d   x o a C D ( i n t   m a C D )   {  
 	 	 i n t   i n d e x   =   t i m C D ( m a C D ) ;  
 	 	 i f ( i n d e x   > =   0 )  
 	 	 	 f o r   ( i n t   i   =   i n d e x ;   i   <   d e m   - 1 ;   i + + )   {  
 	 	 	 	 d s C D [ i ]   =   d s C D [ i   +   1 ] ;  
 	 	 	 }  
 	 	 	  
 	 	 	 d s C D [ d e m   -   1 ]   =   n u l l ;  
 	 	 	  
 	 	 	 d e m   - - ;  
 	 }  
  
 	 p r i v a t e   i n t   t i m C D ( i n t   m a C D )   {  
 	 	 f o r   ( i n t   i   =   0 ;   i   <   d e m ;   i + + )   {  
 	 	 	 C D   t e m p   =   d s C D [ i ] ;  
 	 	 	 i f ( t e m p . g e t M a C D ( )   = =   m a C D )  
 	 	 	 	 r e t u r n   i ;  
 	 	 }  
 	 	 r e t u r n   - 1 ;  
 	 }  
 	  
 	 p u b l i c   C D [ ]   s a p X e p D S C D T h e o D o n G i a ( )   {  
 	 	 C D [ ]   t e m p   =   A r r a y s . c o p y O f ( d s C D ,   d e m ) ;  
 	 	  
 	 	 A r r a y s . s o r t ( t e m p ,   n e w   C o m p a r a t o r < C D > ( )   {  
 	 	 	 @ O v e r r i d e  
 	 	 	 p u b l i c   i n t   c o m p a r e ( C D   o 1 ,   C D   o 2 )   {  
 	 	 	 	 r e t u r n   D o u b l e . c o m p a r e ( o 2 . g e t D o n G i a ( ) ,   o 1 . g e t D o n G i a ( ) ) ;  
 	 	 	 }  
 	 	 } ) ;  
 	 	  
 	 	 r e t u r n   t e m p ;  
 	 }  
 	 p u b l i c   C D [ ]   s a p X e p D S C D T h e o T u a C D ( )   {  
 	 	 C D [ ]   t e m p   =   A r r a y s . c o p y O f ( d s C D ,   d e m ) ;  
 	 	  
 	 	 A r r a y s . s o r t ( t e m p ,   n e w   C o m p a r a t o r < C D > ( )   {  
 	 	 	 @ O v e r r i d e  
 	 	 	 p u b l i c   i n t   c o m p a r e ( C D   o 1 ,   C D   o 2 )   {  
 	 	 	 	 r e t u r n   o 1 . g e t T u a C D ( ) . c o m p a r e T o I g n o r e C a s e ( o 2 . g e t T u a C D ( ) ) ;  
 	 	 	 }  
 	 	 } ) ;  
 	 	  
 	 	 r e t u r n   t e m p ;  
 	 }  
 	  
 }  
 