
/*
var gulp = require('gulp');
// hello world 라고 찍는 task.

gulp.task('hello', function(){
	return console.log('hello');
});

gulp.task('world',['hello'],function(){
	return console.log('world');
});

gulp.task('default',['world']);


*/


var gulp = require('gulp'),
	uglify = require('gulp-uglify'),
	livereload = require('gulp-livereload');

gulp.task('uglify',function(){
	return gulp.src('js/*.js')// src 폴더 아래 모든 js파일
	.pipe(uglify())
	.pipe(gulp.dest('js/dist'))
	.pipe(livereload());
});


gulp.task('default',['uglify']);

gulp.task('watch',function(){
	livereload.listen();
	gulp.watch('js/*.js',['uglify']);
})