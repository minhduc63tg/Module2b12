p a c k a g e   i u h . f i t . w e e k 3 ;  
  
 i m p o r t   j a v a . t e x t . D e c i m a l F o r m a t ;  
  
 p u b l i c   c l a s s   C D   {  
 	  
 	 p r i v a t e   i n t   m a C D ;  
 	 p r i v a t e   S t r i n g   t u a C D ;  
 	 p r i v a t e   i n t   s o B a i H a t ;  
 	 p r i v a t e   d o u b l e   d o n G i a ;  
 	  
 	 p u b l i c   C D ( )   {  
 	 	 t h i s ( 9 9 9 9 9 9 ,   " c h �a   x � c   �n h " ,   0 ,   0 . 0 ) ;  
 	 }  
  
 	 p u b l i c   C D ( i n t   m a C D ,   S t r i n g   t u a C D ,   i n t   s o B a i H a t ,   d o u b l e   d o n G i a )   {  
 / / 	 	 t h i s . m a C D   =   m a C D ;  
 / / 	 	 t h i s . t u a C D   =   t u a C D ;  
 	 	 s e t M a C D ( m a C D ) ;  
 	 	 s e t T u a C D ( t u a C D ) ;  
 	 	 t h i s . s o B a i H a t   =   s o B a i H a t ;  
 	 	 t h i s . d o n G i a   =   d o n G i a ;  
 	 }  
  
 	 p u b l i c   i n t   g e t M a C D ( )   {  
 	 	 r e t u r n   m a C D ;  
 	 }  
  
 	 p u b l i c   v o i d   s e t M a C D ( i n t   m a C D )   {  
 	 	 i f ( m a C D   <   0 )  
 	 	 	 t h i s . m a C D   =   9 9 9 9 9 9 ;  
 	 	 e l s e  
 	 	 	 t h i s . m a C D   =   m a C D ;  
 	 }  
  
 	 p u b l i c   S t r i n g   g e t T u a C D ( )   {  
 	 	 r e t u r n   t u a C D ;  
 	 }  
  
 	 p u b l i c   v o i d   s e t T u a C D ( S t r i n g   t u a C D )   {  
 	 	 i f ( t u a C D   = =   n u l l   | |   t u a C D . t r i m ( ) . l e n g t h ( )   = =   0 )  
 	 	 	 t h i s . t u a C D   =   " c h �a   x � c   �n h " ;  
 	 	 e l s e  
 	 	 	 t h i s . t u a C D   =   t u a C D ;  
 	 }  
  
 	 p u b l i c   i n t   g e t S o B a i H a t ( )   {  
 	 	 r e t u r n   s o B a i H a t ;  
 	 }  
  
 	 p u b l i c   v o i d   s e t S o B a i H a t ( i n t   s o B a i H a t )   {  
 	 	 t h i s . s o B a i H a t   =   s o B a i H a t ;  
 	 }  
  
 	 p u b l i c   d o u b l e   g e t D o n G i a ( )   {  
 	 	 r e t u r n   d o n G i a ;  
 	 }  
  
 	 p u b l i c   v o i d   s e t D o n G i a ( d o u b l e   d o n G i a )   {  
 	 	 t h i s . d o n G i a   =   d o n G i a ;  
 	 }  
 	  
 	 @ O v e r r i d e  
 	 p u b l i c   S t r i n g   t o S t r i n g ( )   {  
 	 	 D e c i m a l F o r m a t   d f   =   n e w   D e c i m a l F o r m a t ( " # , # # 0 . #   V N D " ) ;  
 	 	 r e t u r n   S t r i n g . f o r m a t ( " % - 1 0 s   % - 2 5 s   % 1 0 s   % 1 5 s " ,   m a C D ,   t u a C D ,   s o B a i H a t ,   d f . f o r m a t ( d o n G i a ) ) ;  
 	 }  
 	  
  
 }  
 