public 	class Main{
	public static void main(String[] args){
		GreetingsGenerator generator = new GreetingsGenerator();
		RenderService renderer = new RenderService();
		
		System.out.println(renderer.render(generator.generateGreetings(" Uram")));
	}
}