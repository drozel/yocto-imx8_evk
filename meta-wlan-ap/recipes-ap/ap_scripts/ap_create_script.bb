SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "ap_create script" 
DEPENDS=""
SECTION = "wlan" 
LICENSE = "CLOSED" 
PR = "r0"
SRC_URI = "git://github.com/oblique/create_ap.git"
SRCREV = "d68d4dfad9db940f82dbf5f625b59e7f64579664"
S = "${WORKDIR}/git"
FILES_${PN} += "${bindir}"
RDEPENDS_${PN} += "bash"


do_install() {
    install -d ${D}${bindir}
    install -m 0755 create_ap ${D}${bindir}
}
