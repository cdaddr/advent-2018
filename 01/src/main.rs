use std::io::prelude::*;
use std::io::{BufRead, BufReader, Result};
use std::fs::File;
use std::path::Path;
use std::error::Error;

fn main() -> Result<()>{
    let mut freq = 0;
    let path = Path::new("input.txt");
    let mut file = match File::open(path) {
        Err(why) => panic!("can't open {}: {}", path.display(), why.description() ),
        Ok(file) => {
            for line in BufReader::new(file).lines().filter_map(|res| res.ok()) {
                let (sign, num) = if &line[0..1] == "-" {
                    (-1, line[1..].to_string())
                } else {
                    (1, line.to_string())
                };
                let num = num.parse::<i32>().unwrap();
                freq = freq + (sign * num);
            }
        }
    };
    println!("{}", freq);
    Ok(())
}