SUMMARY="proccgi.c package"

SRC_URI="git://github.com/varjagg/proccgi-am.git"
SRCREV = "${AUTOREV}"

LICENSE="GPLv2"
LIC_FILES_CHKSUM="file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
S="${WORKDIR}/git"

inherit autotools pkgconfig
